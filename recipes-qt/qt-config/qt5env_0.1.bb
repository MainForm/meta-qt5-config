DESCRIPTION = "QT5 Environment Setup"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://COPYING \
           file://qt5env.sh \
          "

S = "${WORKDIR}"

do_install() {
	install -d ${D}${sysconfdir}/profile.d
	install -m 0755 qt5env.sh ${D}${sysconfdir}/profile.d
}
