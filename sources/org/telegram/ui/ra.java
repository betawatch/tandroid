package org.telegram.ui;

import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements org.telegram.messenger.bs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.bs
    public final void a(int i10) {
        as0 as0Var;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((sb) obj).Y0(true);
                break;
            case 1:
                un unVar = ((fn) obj).a;
                if (i10 > 0 && unVar.getParentActivity() != null && unVar.fragmentView != null) {
                    org.telegram.ui.Components.cc.a0(unVar).m(org.telegram.ui.Components.bc.I, i10, 0, 0, unVar.xa).j();
                    break;
                }
                break;
            case 2:
                ((NotificationsCustomSettingsActivity) obj).p0(true);
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.D != null && (as0Var = photoViewer.e0) != null && i10 > 0) {
                    org.telegram.ui.Components.cc.F(as0Var, true).j();
                    break;
                }
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.R6;
                if (i10 != 1) {
                    profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.d1));
                    break;
                } else {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.I1 = 0;
                    profileActivity.finishFragment();
                    break;
                }
            default:
                pb1 pb1Var = ((va1) obj).a;
                if (i10 != 0) {
                    pb1Var.finishFragment();
                    break;
                } else {
                    pb1Var.R0(false);
                    break;
                }
        }
    }
}
