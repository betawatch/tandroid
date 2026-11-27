// default package

import android.graphics.RectF;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yh1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.PhotoSize b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.InputFile d;
    public final /* synthetic */ TLRPC.VideoSize e;
    public final /* synthetic */ TLRPC.PhotoSize f;
    public final /* synthetic */ double h;
    public final /* synthetic */ String n;
    public final /* synthetic */ yn5 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ yh1(e eVar, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = (yn5) eVar;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.n = str;
        this.h = d;
        this.b = photoSize;
        this.f = photoSize2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        double d = this.h;
        String str = this.n;
        TLRPC.VideoSize videoSize = this.e;
        TLRPC.InputFile inputFile = this.d;
        TLRPC.InputFile inputFile2 = this.c;
        TLRPC.PhotoSize photoSize = this.f;
        TLRPC.PhotoSize photoSize2 = this.b;
        byte b2 = 1;
        yn5 yn5Var = this.r;
        switch (b) {
            case 0:
                gi1 gi1Var = (gi1) yn5Var;
                if (inputFile2 != null || inputFile != null) {
                    gi1Var.n0 = inputFile2;
                    gi1Var.o0 = inputFile;
                    gi1Var.p0 = videoSize;
                    gi1Var.q0 = str;
                    gi1Var.r0 = d;
                    if (gi1Var.s0) {
                        id idVar = gi1Var.w0;
                        if (idVar != null) {
                            try {
                                idVar.dismiss();
                                gi1Var.w0 = null;
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                        gi1Var.l0(false);
                        gi1Var.t0 = false;
                        gi1Var.a.performClick();
                    }
                    gi1Var.i0(false, true);
                    gi1Var.n.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation = photoSize2.location;
                    gi1Var.E = fileLocation;
                    gi1Var.F = photoSize.location;
                    gi1Var.f.m(jn5.e(fileLocation), "50_50", gi1Var.w, null);
                    gi1Var.i0(true, false);
                    break;
                }
            case 1:
                g92 g92Var = (g92) yn5Var;
                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                g92Var.v0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                if (inputFile3 != null || inputFile4 != null || videoSize2 != null) {
                    long j = g92Var.C0;
                    double d2 = this.h;
                    if (j != 0) {
                        TLRPC.User user = g92Var.D0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = g92Var.D0.photo;
                            userProfilePhoto.photo_id = inputFile3 != null ? inputFile3.id : inputFile4 != null ? inputFile4.id : 0L;
                            userProfilePhoto.photo_big = photoSize.location;
                            userProfilePhoto.photo_small = photoSize2.location;
                            g92Var.getMessagesController().i4(g92Var.D0, true, false);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile3 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile3;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile4 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile4;
                            int i = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d2;
                            tL_photos_uploadProfilePhoto.flags = i | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = g92Var.getMessagesController().q1(g92Var.D0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        g92Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new z82(g92Var, b2));
                    } else {
                        g92Var.getMessagesController().z(g92Var.w0, null, inputFile3, inputFile4, videoSize2, d2, this.n, photoSize2.location, photoSize.location, null);
                    }
                    if (g92Var.N0) {
                        try {
                            id idVar2 = g92Var.b;
                            if (idVar2 != null && idVar2.isShowing()) {
                                g92Var.b.dismiss();
                                g92Var.b = null;
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        g92Var.O0 = false;
                        g92Var.a.performClick();
                    }
                    g92Var.r0(false, true);
                    break;
                } else {
                    mb0 mb0Var = g92Var.e;
                    jn5 e3 = jn5.e(fileLocation2);
                    rb0 rb0Var = g92Var.r;
                    Object obj = g92Var.D0;
                    if (obj == null) {
                        obj = g92Var.x0;
                    }
                    mb0Var.m(e3, "50_50", rb0Var, obj);
                    g92Var.c0.o(R.drawable.msg_addphoto, ob6.M0(2131752178, "ChatSetNewPhoto"), true);
                    if (g92Var.S0 == null) {
                        g92Var.S0 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
                    }
                    g92Var.c0.e.setTranslationX(-hl.L(8.0f));
                    g92Var.c0.e.setAnimation(g92Var.S0);
                    g92Var.r0(true, false);
                    break;
                }
                break;
            case 2:
                xn2 xn2Var = (xn2) yn5Var;
                TLRPC.FileLocation fileLocation3 = photoSize2.location;
                xn2Var.H = fileLocation3;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile5 == null && inputFile6 == null && videoSize3 == null) {
                    xn2Var.x.m(jn5.e(fileLocation3), "50_50", xn2Var.F, xn2Var.J);
                    xn2Var.e0(true, false);
                } else {
                    xn2Var.getMessagesController().z(xn2Var.c, null, inputFile5, inputFile6, videoSize3, this.h, this.n, photoSize2.location, photoSize.location, null);
                    xn2Var.e0(false, true);
                }
                xn2Var.e.g3.O(true);
                break;
            case 3:
                v85 v85Var = (v85) yn5Var;
                long j2 = v85Var.e;
                j95 j95Var = v85Var.f;
                k5 k5Var = j95Var.n1;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile7 != null || inputFile8 != null || videoSize4 != null) {
                    double d3 = this.h;
                    String str2 = this.n;
                    if (j2 <= 0) {
                        uc7.s1(k5Var.a).z(-j2, null, inputFile7, inputFile8, videoSize4, d3, str2, photoSize2.location, photoSize.location, new rj4(v85Var, (byte) 26));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile7 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile7;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile8 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile8;
                            int i2 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d3;
                            tL_photos_uploadProfilePhoto2.flags = i2 | 6;
                        }
                        if (videoSize4 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize4;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        ConnectionsManager.getInstance(k5Var.a).sendRequest(tL_photos_uploadProfilePhoto2, new mw3(v85Var, str2, (byte) 9));
                        break;
                    }
                } else {
                    v85Var.c = photoSize2.location;
                    TLRPC.FileLocation fileLocation4 = photoSize.location;
                    v85Var.b = fileLocation4;
                    jn5 e4 = jn5.e(fileLocation4);
                    v85Var.d = e4;
                    j95Var.l1.A(e4, jn5.e(v85Var.c));
                    hl.V3(j95Var.J1);
                    break;
                }
            case 4:
                xc5 xc5Var = (xc5) yn5Var;
                if (inputFile2 != null || inputFile != null || videoSize != null) {
                    xc5Var.G = inputFile2;
                    xc5Var.H = inputFile;
                    xc5Var.I = videoSize;
                    xc5Var.J = str;
                    xc5Var.K = d;
                    if (xc5Var.M) {
                        xc5Var.getMessagesController().S(xc5Var.c.getText().toString(), xc5Var.L, null, xc5Var.Q, xc5Var.T, xc5Var.V, xc5Var.U, xc5Var.X, xc5Var);
                    }
                    xc5Var.d0(false, true);
                    xc5Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation5 = photoSize2.location;
                    xc5Var.E = fileLocation5;
                    xc5Var.F = photoSize.location;
                    xc5Var.d.m(jn5.e(fileLocation5), "50_50", xc5Var.r, null);
                    xc5Var.d0(true, false);
                    break;
                }
            case 5:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) yn5Var).C2(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            default:
                ((uba) yn5Var).e0(this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
        }
    }

    public /* synthetic */ yh1(xn2 xn2Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = (byte) 2;
        this.r = xn2Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }

    public /* synthetic */ yh1(yn5 yn5Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, byte b) {
        this.a = b;
        this.r = yn5Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public /* synthetic */ yh1(g92 g92Var, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = (byte) 1;
        this.r = g92Var;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }
}
