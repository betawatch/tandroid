// default package

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vq8 extends yc8 {
    public final /* synthetic */ ProfileActivity a;

    public vq8(ProfileActivity profileActivity) {
        this.a = profileActivity;
    }

    @Override // yc8, ed8
    public final void F() {
        this.a.f0.getImageReceiver().v0(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Type inference failed for: r12v8, types: [de0] */
    @Override // yc8, ed8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        boolean z3;
        jq8 jq8Var;
        int i2;
        boolean z4;
        long j;
        jq8 jq8Var2;
        jq8 jq8Var3;
        dt8 dt8Var;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (fileLocation != null) {
            ProfileActivity profileActivity = this.a;
            if (profileActivity.Y.getScaleX() <= 0.96f || !z2) {
                if (profileActivity.e1 != 0) {
                    TLRPC.FileLocation fileLocation2 = null;
                    boolean z5 = false;
                    z3 = fileLocation2 == null && fileLocation2.local_id == fileLocation.local_id && fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.dc_id == fileLocation.dc_id;
                    jq8Var = profileActivity.o0;
                    if (jq8Var != null) {
                        int realCount = jq8Var.getRealCount();
                        i2 = 0;
                        while (i2 < realCount) {
                            jn5 G = profileActivity.o0.G(i2);
                            if (G != null && (tL_fileLocationToBeDeprecated = G.f) != null && tL_fileLocationToBeDeprecated.local_id == fileLocation.local_id && tL_fileLocationToBeDeprecated.volume_id == fileLocation.volume_id && G.a == fileLocation.dc_id) {
                                z3 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                    i2 = -1;
                    if (z3) {
                        iq8 iq8Var = profileActivity.f0;
                        if (i2 >= 0 && (jq8Var2 = profileActivity.o0) != null && jq8Var2.getVisibility() == 0) {
                            if (i2 != profileActivity.o0.getRealPosition() && (dt8Var = (jq8Var3 = profileActivity.o0).E0) != null) {
                                jq8Var3.x(dt8Var.j() + i2, false);
                            }
                            ?? currentItemView = profileActivity.o0.getCurrentItemView();
                            if (currentItemView != 0) {
                                iq8Var = currentItemView;
                                z4 = true;
                                int[] iArr = new int[2];
                                iq8Var.getLocationInWindow(iArr);
                                fd8 fd8Var = new fd8();
                                fd8Var.b = iArr[0];
                                fd8Var.c = iArr[1];
                                fd8Var.d = iq8Var;
                                ImageReceiver imageReceiver = iq8Var.getImageReceiver();
                                fd8Var.a = imageReceiver;
                                j = profileActivity.e1;
                                if (j == 0) {
                                    fd8Var.f = j;
                                } else {
                                    long j2 = profileActivity.f1;
                                    if (j2 != 0) {
                                        fd8Var.f = -j2;
                                    }
                                }
                                fd8Var.e = imageReceiver.p();
                                fd8Var.g = -1L;
                                fd8Var.h = iq8Var.getImageReceiver().z();
                                fd8Var.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                                fd8Var.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                                if (!z4 && profileActivity.Y.getScaleX() > 0.96f) {
                                    z5 = true;
                                }
                                fd8Var.r = z5;
                                fd8Var.s = z4;
                                return fd8Var;
                            }
                        }
                        z4 = false;
                        int[] iArr2 = new int[2];
                        iq8Var.getLocationInWindow(iArr2);
                        fd8 fd8Var2 = new fd8();
                        fd8Var2.b = iArr2[0];
                        fd8Var2.c = iArr2[1];
                        fd8Var2.d = iq8Var;
                        ImageReceiver imageReceiver2 = iq8Var.getImageReceiver();
                        fd8Var2.a = imageReceiver2;
                        j = profileActivity.e1;
                        if (j == 0) {
                        }
                        fd8Var2.e = imageReceiver2.p();
                        fd8Var2.g = -1L;
                        fd8Var2.h = iq8Var.getImageReceiver().z();
                        fd8Var2.k = !z4 ? 1.0f : profileActivity.Y.getScaleX();
                        fd8Var2.p = profileActivity.e1 != profileActivity.getUserConfig().n;
                        if (!z4) {
                            z5 = true;
                        }
                        fd8Var2.r = z5;
                        fd8Var2.s = z4;
                        return fd8Var2;
                    }
                } else {
                    TLRPC.FileLocation fileLocation22 = null;
                    boolean z52 = false;
                    if (fileLocation22 == null) {
                    }
                    jq8Var = profileActivity.o0;
                    if (jq8Var != null) {
                    }
                    i2 = -1;
                    if (z3) {
                    }
                }
            }
        }
        return null;
    }

    @Override // yc8, ed8
    public final void g(String str, String str2, boolean z) {
        this.a.r0.p(str, str2, z);
    }
}
