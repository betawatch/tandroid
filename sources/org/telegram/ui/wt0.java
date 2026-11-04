package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ wt0(ProfileActivity profileActivity, int i3) {
        this.a = i3;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i3 = this.a;
        final ProfileActivity profileActivity = this.b;
        switch (i3) {
            case 0:
                RectF rectF = ProfileActivity.T6;
                final int i10 = 1;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i11) {
                            case 0:
                                RectF rectF2 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                RectF rectF2 = ProfileActivity.T6;
                final int i11 = 2;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                RectF rectF3 = ProfileActivity.T6;
                final int i12 = 3;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                RectF rectF4 = ProfileActivity.T6;
                final int i13 = 0;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.yt0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF42 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.T6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.k5.p(null, 2131743889, org.telegram.ui.Components.fc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                RectF rectF5 = ProfileActivity.T6;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new hk0(26, profileActivity, tLObject));
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TL_account.TL_password)) {
                    RectF rectF6 = ProfileActivity.T6;
                    profileActivity.getClass();
                    break;
                } else {
                    profileActivity.H2 = (TL_account.TL_password) tLObject;
                    break;
                }
        }
    }
}
