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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                ph.da daVar = (ph.da) this.c;
                Bitmap bitmap = (Bitmap) obj2;
                int i10 = daVar.c;
                if (obj != null && daVar.m2 == null && !daVar.T && daVar.J()) {
                    int i11 = 0;
                    if (!this.b) {
                        daVar.i0(false, true);
                        daVar.N0.a(daVar.L1);
                        ph.s5 s5Var = daVar.L0;
                        boolean z10 = daVar.L1 == 1;
                        s5Var.k0 = -1.0f;
                        s5Var.l0 = z10;
                        s5Var.invalidate();
                        daVar.f(false);
                        boolean z11 = obj instanceof MediaController.PhotoEntry;
                        if (!z11) {
                            if (obj instanceof ph.t6) {
                                ph.t6 t6Var = (ph.t6) obj;
                                if (t6Var.L == null && !t6Var.v()) {
                                    daVar.b1.c(R.raw.error, "Failed to load draft");
                                    MessagesController.getInstance(i10).getStoriesController().w.c(t6Var);
                                    break;
                                } else {
                                    t6Var.J0 = daVar.s0;
                                    t6Var.K0 = daVar.t0;
                                    daVar.L1 = t6Var.K ? 1 : 0;
                                    t6Var.M0 = bitmap;
                                    daVar.I1 = false;
                                    daVar.x0.n(t6Var);
                                    daVar.H1 = t6Var;
                                    if (z11) {
                                        ph.f8.a(i10, t6Var);
                                    }
                                    daVar.K(1, true);
                                }
                            }
                        } else {
                            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                i11 = 1;
                            }
                            daVar.L1 = i11;
                            ph.t6 l10 = ph.t6.l(photoEntry);
                            l10.M0 = bitmap;
                            l10.J0 = daVar.s0;
                            l10.K0 = daVar.t0;
                            l10.A();
                            daVar.I1 = true;
                            if (daVar.x0.j()) {
                                daVar.D1 = null;
                                l10.P = 1.0f;
                                if (daVar.x0.l(l10)) {
                                    daVar.H1 = ph.t6.a(daVar.x0.getLayout(), daVar.x0.getContent());
                                }
                                daVar.m0(true);
                            } else {
                                l10.B();
                                daVar.H1 = l10;
                                if (z11) {
                                    ph.f8.a(i10, l10);
                                }
                                daVar.K(1, true);
                            }
                        }
                    } else if (daVar.H1 != null) {
                        daVar.u();
                        daVar.H1.j = true;
                        if (obj instanceof MediaController.PhotoEntry) {
                            ph.h9 h9Var = daVar.s1;
                            h9Var.d0(h9Var.k0(((MediaController.PhotoEntry) obj).path, false));
                        } else if (obj instanceof TLObject) {
                            ph.h9 h9Var2 = daVar.s1;
                            TLObject tLObject = (TLObject) obj;
                            h9Var2.i2 = true;
                            ph.w4 w4Var = h9Var2.O0;
                            float f10 = (!(tLObject instanceof TLRPC.Photo) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, MediaDataController.MAX_STYLE_RUNS_COUNT)) == null) ? 1.0f : closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h;
                            if (f10 > 1.0f) {
                                float floor = (float) Math.floor(Math.max(h9Var2.O1, w4Var.getMeasuredWidth()) * 0.5d);
                                jv0Var = new org.telegram.ui.Components.jv0(floor, floor / f10);
                            } else {
                                float floor2 = (float) Math.floor(Math.max(h9Var2.P1, w4Var.getMeasuredHeight()) * 0.5d);
                                jv0Var = new org.telegram.ui.Components.jv0(f10 * floor2, floor2);
                            }
                            dg.v2 v2Var = new dg.v2(h9Var2.getContext(), h9Var2.e0(), jv0Var, tLObject);
                            v2Var.setDelegate(h9Var2);
                            w4Var.addView(v2Var);
                            h9Var2.g0();
                            h9Var2.d0(v2Var);
                        }
                        daVar.f(false);
                    }
                    ph.e9 e9Var = daVar.J0;
                    if (e9Var != null) {
                        daVar.i2 = e9Var.e.e0();
                        daVar.j2 = daVar.J0.getSelectedAlbum();
                        break;
                    }
                }
                break;
            default:
                sh.i0.m((sh.i0) this.c, this.b, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
