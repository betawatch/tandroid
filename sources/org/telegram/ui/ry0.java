package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate c;

    public /* synthetic */ ry0(boolean z4, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.c = notificationCenterDelegate;
        this.b = z4;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        org.telegram.ui.Components.jv0 jv0Var;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                Integer num = (Integer) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (!profileActivity.M3()) {
                    if (org.telegram.ui.Components.qc.a(profileActivity)) {
                        int intValue = num.intValue();
                        boolean z4 = this.b;
                        if (intValue == 1) {
                            org.telegram.ui.Components.qc.l(null, profileActivity, z4).j();
                        } else if (num.intValue() == 2) {
                            org.telegram.ui.Components.qc.l(DialogObject.getShortName(profileActivity.b1), profileActivity, z4).j();
                        } else if (tL_error != null) {
                            org.telegram.ui.Components.qc.b0(tL_error);
                        }
                    }
                    FlagSecureReason flagSecureReason = profileActivity.U1;
                    if (flagSecureReason != null) {
                        flagSecureReason.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                qh.ba baVar = (qh.ba) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = baVar.c;
                if (obj != null && baVar.m2 == null && !baVar.T && baVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        baVar.i0(false, true);
                        baVar.N0.a(baVar.L1);
                        qh.q5 q5Var = baVar.L0;
                        boolean z10 = baVar.L1 == 1;
                        q5Var.k0 = -1.0f;
                        q5Var.l0 = z10;
                        q5Var.invalidate();
                        baVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof qh.r6) {
                                qh.r6 r6Var = (qh.r6) obj;
                                if (r6Var.L == null && !r6Var.v()) {
                                    baVar.b1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.c(r6Var);
                                    break;
                                } else {
                                    r6Var.J0 = baVar.s0;
                                    r6Var.K0 = baVar.t0;
                                    baVar.L1 = r6Var.K ? 1 : 0;
                                    r6Var.M0 = bitmap;
                                    baVar.I1 = false;
                                    baVar.x0.n(r6Var);
                                    baVar.H1 = r6Var;
                                    if (z11) {
                                        qh.e8.a(i10, r6Var);
                                    }
                                    baVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            baVar.L1 = i11;
                            qh.r6 l10 = qh.r6.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = baVar.s0;
                            l10.K0 = baVar.t0;
                            l10.A();
                            baVar.I1 = true;
                            if (baVar.x0.j()) {
                                baVar.D1 = null;
                                l10.P = 1.0f;
                                if (baVar.x0.l(l10)) {
                                    baVar.H1 = qh.r6.a(baVar.x0.getLayout(), baVar.x0.getContent());
                                }
                                baVar.m0(true);
                            } else {
                                l10.B();
                                baVar.H1 = l10;
                                if (z11) {
                                    qh.e8.a(i10, l10);
                                }
                                baVar.K(1, true);
                            }
                        }
                    } else if (baVar.H1 != null) {
                        baVar.u();
                        baVar.H1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            qh.e9 e9Var = baVar.s1;
                            e9Var.d0(e9Var.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            qh.e9 e9Var2 = baVar.s1;
                            TLObject tLObject = (TLObject) obj;
                            e9Var2.i2 = true;
                            qh.v4 v4Var = e9Var2.O0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(e9Var2.O1, v4Var.getMeasuredWidth()) * 0.5d);
                                jv0Var = new org.telegram.ui.Components.jv0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(e9Var2.P1, v4Var.getMeasuredHeight()) * 0.5d);
                                jv0Var = new org.telegram.ui.Components.jv0(f10 * floor2, floor2);
                            }
                            eg.t2 t2Var = new eg.t2(e9Var2.getContext(), e9Var2.e0(), jv0Var, tLObject);
                            t2Var.setDelegate(e9Var2);
                            v4Var.addView(t2Var);
                            e9Var2.g0();
                            e9Var2.d0(t2Var);
                        }
                        baVar.f(false);
                    }
                    qh.b9 b9Var = baVar.J0;
                    if (b9Var != null) {
                        baVar.i2 = b9Var.e.e0();
                        baVar.j2 = baVar.J0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            default:
                th.i0.m((th.i0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
