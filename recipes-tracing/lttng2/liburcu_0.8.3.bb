DESCRIPTION = "Userspace RCU Implementation by Mathieu Desnoyers and Paul E. McKenney"
HOMEPAGE = "http://lttng.org/urcu"
BUGTRACKER = "http://lttng.org/project/issues"

LICENSE = "LGPLv2.1+ & MIT-style"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f060c30a27922ce9c0d557a639b4fa3 \
                    file://urcu.h;beginline=4;endline=32;md5=4de0d68d3a997643715036d2209ae1d9 \
                    file://urcu/uatomic/x86.h;beginline=4;endline=21;md5=220552f72c55b102f2ee35929734ef42"

SRCREV = "v0.8.3"
PV = "0.8.3+git${SRCPV}"

SRC_URI = "git://git.lttng.org/userspace-rcu.git \
           file://whitelist-sourcery-codebench-2013.11-32.patch"

S = "${WORKDIR}/git"
CFLAGS_append_libc-uclibc = " -D_GNU_SOURCE"
inherit autotools
