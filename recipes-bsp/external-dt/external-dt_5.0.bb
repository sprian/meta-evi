SUMMARY = "Provides Device Tree files for STM32MP boards"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

# target to customized device tree file
SRC_URI = "git://github.com/sprian/meta-evi.git;branch=main;protocol=https"
SRCREV = "HEAD"  

EXT_DT_VERSION = "v5.0"
EXT_DT_RELEASE = "stm32mp-r1.1"

PV = "${EXT_DT_VERSION}-${EXT_DT_RELEASE}"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "(stm32mpcommon)"
