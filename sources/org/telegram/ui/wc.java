package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.PhotoSize b;
    public final /* synthetic */ TLRPC.InputFile c;
    public final /* synthetic */ TLRPC.InputFile d;
    public final /* synthetic */ TLRPC.VideoSize e;
    public final /* synthetic */ TLRPC.PhotoSize f;
    public final /* synthetic */ double h;
    public final /* synthetic */ String n;
    public final /* synthetic */ org.telegram.ui.Components.r40 r;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ wc(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, String str, double d, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = (org.telegram.ui.Components.r40) o2Var;
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
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                hd hdVar = (hd) this.r;
                TLRPC.InputFile inputFile = this.c;
                TLRPC.InputFile inputFile2 = this.d;
                if (inputFile != null || inputFile2 != null) {
                    hdVar.h0 = inputFile;
                    hdVar.i0 = inputFile2;
                    hdVar.j0 = this.e;
                    hdVar.k0 = this.n;
                    hdVar.l0 = this.h;
                    if (hdVar.m0) {
                        org.telegram.ui.ActionBar.c2 c2Var = hdVar.q0;
                        if (c2Var != null) {
                            try {
                                c2Var.dismiss();
                                hdVar.q0 = null;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                        hdVar.g0(false);
                        hdVar.n0 = false;
                        hdVar.a.performClick();
                    }
                    hdVar.e0(false, true);
                    hdVar.h.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation = this.b.location;
                    hdVar.x = fileLocation;
                    hdVar.y = this.f.location;
                    hdVar.e.h(ImageLocation.getForLocal(fileLocation), "50_50", hdVar.s, null);
                    hdVar.e0(true, false);
                    break;
                }
            case 1:
                ko koVar = (ko) this.r;
                TLRPC.PhotoSize photoSize = this.b;
                TLRPC.FileLocation fileLocation2 = photoSize.location;
                koVar.r0 = fileLocation2;
                TLRPC.InputFile inputFile3 = this.c;
                TLRPC.InputFile inputFile4 = this.d;
                TLRPC.VideoSize videoSize = this.e;
                if (inputFile3 != null || inputFile4 != null || videoSize != null) {
                    long j10 = koVar.y0;
                    TLRPC.PhotoSize photoSize2 = this.f;
                    double d = this.h;
                    long j11 = 0;
                    if (j10 != 0) {
                        TLRPC.User user = koVar.z0;
                        if (user != null) {
                            user.photo = new TLRPC.TL_userProfilePhoto();
                            TLRPC.UserProfilePhoto userProfilePhoto = koVar.z0.photo;
                            if (inputFile3 != null) {
                                j11 = inputFile3.id;
                            } else if (inputFile4 != null) {
                                j11 = inputFile4.id;
                            }
                            userProfilePhoto.photo_id = j11;
                            userProfilePhoto.photo_big = photoSize2.location;
                            userProfilePhoto.photo_small = photoSize.location;
                            koVar.getMessagesController().putUser(koVar.z0, true);
                        }
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile3 != null) {
                            tL_photos_uploadProfilePhoto.file = inputFile3;
                            tL_photos_uploadProfilePhoto.flags |= 1;
                        }
                        if (inputFile4 != null) {
                            tL_photos_uploadProfilePhoto.video = inputFile4;
                            int i10 = tL_photos_uploadProfilePhoto.flags;
                            tL_photos_uploadProfilePhoto.video_start_ts = d;
                            tL_photos_uploadProfilePhoto.flags = i10 | 6;
                        }
                        if (videoSize != null) {
                            tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                            tL_photos_uploadProfilePhoto.flags |= 16;
                        }
                        tL_photos_uploadProfilePhoto.bot = koVar.getMessagesController().getInputUser(koVar.z0);
                        tL_photos_uploadProfilePhoto.flags |= 32;
                        koVar.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new co(koVar, 1));
                        z10 = false;
                    } else {
                        MessagesController messagesController = koVar.getMessagesController();
                        long j12 = koVar.s0;
                        TLRPC.FileLocation fileLocation3 = photoSize.location;
                        TLRPC.FileLocation fileLocation4 = photoSize2.location;
                        z10 = false;
                        messagesController.changeChatAvatar(j12, null, inputFile3, inputFile4, videoSize, d, this.n, fileLocation3, fileLocation4, null);
                    }
                    if (koVar.I0) {
                        try {
                            org.telegram.ui.ActionBar.c2 c2Var2 = koVar.b;
                            if (c2Var2 != null && c2Var2.isShowing()) {
                                koVar.b.dismiss();
                                koVar.b = null;
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        koVar.J0 = z10;
                        koVar.a.performClick();
                    }
                    koVar.n0(z10, true);
                    break;
                } else {
                    lh.y3 y3Var = koVar.e;
                    ImageLocation forLocal = ImageLocation.getForLocal(fileLocation2);
                    org.telegram.ui.Components.e9 e9Var = koVar.r;
                    Object obj = koVar.z0;
                    if (obj == null) {
                        obj = koVar.t0;
                    }
                    y3Var.h(forLocal, "50_50", e9Var, obj);
                    koVar.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    if (koVar.N0 == null) {
                        koVar.N0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    koVar.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    koVar.X.e.setAnimation(koVar.N0);
                    koVar.n0(true, false);
                    break;
                }
                break;
            case 2:
                y40 y40Var = (y40) this.r;
                long j13 = y40Var.e;
                r50 r50Var = y40Var.f;
                AccountInstance accountInstance = r50Var.d;
                TLRPC.InputFile inputFile5 = this.c;
                TLRPC.InputFile inputFile6 = this.d;
                TLRPC.VideoSize videoSize2 = this.e;
                TLRPC.PhotoSize photoSize3 = this.b;
                TLRPC.PhotoSize photoSize4 = this.f;
                if (inputFile5 != null || inputFile6 != null || videoSize2 != null) {
                    double d10 = this.h;
                    String str = this.n;
                    if (j13 <= 0) {
                        accountInstance.getMessagesController().changeChatAvatar(-j13, null, inputFile5, inputFile6, videoSize2, d10, str, photoSize3.location, photoSize4.location, new q00(y40Var, 6));
                        break;
                    } else {
                        TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto2 = new TLRPC.TL_photos_uploadProfilePhoto();
                        if (inputFile5 != null) {
                            tL_photos_uploadProfilePhoto2.file = inputFile5;
                            tL_photos_uploadProfilePhoto2.flags |= 1;
                        }
                        if (inputFile6 != null) {
                            tL_photos_uploadProfilePhoto2.video = inputFile6;
                            int i11 = tL_photos_uploadProfilePhoto2.flags;
                            tL_photos_uploadProfilePhoto2.video_start_ts = d10;
                            tL_photos_uploadProfilePhoto2.flags = i11 | 6;
                        }
                        if (videoSize2 != null) {
                            tL_photos_uploadProfilePhoto2.video_emoji_markup = videoSize2;
                            tL_photos_uploadProfilePhoto2.flags |= 16;
                        }
                        accountInstance.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto2, new zg(26, y40Var, str));
                        break;
                    }
                } else {
                    y40Var.c = photoSize3.location;
                    TLRPC.FileLocation fileLocation5 = photoSize4.location;
                    y40Var.b = fileLocation5;
                    ImageLocation forLocal2 = ImageLocation.getForLocal(fileLocation5);
                    y40Var.d = forLocal2;
                    r50Var.b.A(forLocal2, ImageLocation.getForLocal(y40Var.c));
                    AndroidUtilities.updateVisibleRows(r50Var.M);
                    break;
                }
            case 3:
                t60 t60Var = (t60) this.r;
                TLRPC.InputFile inputFile7 = this.c;
                TLRPC.InputFile inputFile8 = this.d;
                TLRPC.VideoSize videoSize3 = this.e;
                if (inputFile7 != null || inputFile8 != null || videoSize3 != null) {
                    t60Var.B = inputFile7;
                    t60Var.C = inputFile8;
                    t60Var.D = videoSize3;
                    t60Var.E = this.n;
                    t60Var.F = this.h;
                    if (t60Var.H) {
                        t60Var.getMessagesController().createChat(t60Var.c.getText().toString(), t60Var.G, null, t60Var.L, t60Var.O, t60Var.Q, t60Var.P, t60Var.S, t60Var);
                    }
                    t60Var.Z(false, true);
                    t60Var.f.setImageDrawable(null);
                    break;
                } else {
                    TLRPC.FileLocation fileLocation6 = this.b.location;
                    t60Var.y = fileLocation6;
                    t60Var.A = this.f.location;
                    t60Var.d.h(ImageLocation.getForLocal(fileLocation6), "50_50", t60Var.r, null);
                    t60Var.Z(true, false);
                    break;
                }
            case 4:
                ProfileActivity.d0((ProfileActivity) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            case 5:
                b81.d0((b81) this.r, this.c, this.d, this.e, this.h, this.n, this.b, this.f);
                break;
            default:
                qh.n nVar = (qh.n) this.r;
                nVar.getClass();
                TLRPC.PhotoSize photoSize5 = this.b;
                TLRPC.FileLocation fileLocation7 = photoSize5.location;
                nVar.B = fileLocation7;
                TLRPC.InputFile inputFile9 = this.c;
                TLRPC.InputFile inputFile10 = this.d;
                TLRPC.VideoSize videoSize4 = this.e;
                if (inputFile9 == null && inputFile10 == null && videoSize4 == null) {
                    nVar.v.h(ImageLocation.getForLocal(fileLocation7), "50_50", nVar.y, nVar.D);
                    nVar.a0(true, false);
                    z11 = true;
                } else {
                    z11 = true;
                    nVar.getMessagesController().changeChatAvatar(nVar.b, null, inputFile9, inputFile10, videoSize4, this.h, this.n, photoSize5.location, this.f.location, null);
                    nVar.a0(false, true);
                }
                nVar.d.U2.N(z11);
                break;
        }
    }

    public /* synthetic */ wc(ko koVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, TLRPC.PhotoSize photoSize2, double d, String str) {
        this.a = 1;
        this.r = koVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.f = photoSize2;
        this.h = d;
        this.n = str;
    }

    public /* synthetic */ wc(org.telegram.ui.Components.r40 r40Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, int i10) {
        this.a = i10;
        this.r = r40Var;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.b = photoSize;
        this.f = photoSize2;
    }

    public /* synthetic */ wc(qh.n nVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize2) {
        this.a = 6;
        this.r = nVar;
        this.b = photoSize;
        this.c = inputFile;
        this.d = inputFile2;
        this.e = videoSize;
        this.h = d;
        this.n = str;
        this.f = photoSize2;
    }
}
