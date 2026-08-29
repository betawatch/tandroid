package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wj0 extends zf.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public wj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.E.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i10 >= notificationsCustomSettingsActivity.E.size()) {
            return 5;
        }
        return ((vj0) notificationsCustomSettingsActivity.E.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        ArrayList arrayList = this.e.E;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        vj0 vj0Var = (vj0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((vj0) arrayList.get(i11)).a != 4;
        int i12 = n1Var.f;
        View view = n1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.k4) view).setText(vj0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.q8) view).f("" + ((Object) vj0Var.e), vj0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.sa) view).g(vj0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.s8) view).b(vj0Var.h, "" + ((Object) vj0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (vj0Var.e != null) {
                    y8Var.setFixedSize(0);
                    y8Var.setText(vj0Var.e);
                    break;
                } else {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.y9) view).c(vj0Var.e, vj0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                h5Var.setDrawLine(true);
                h5Var.setChecked(vj0Var.i);
                h5Var.b(vj0Var.e, vj0Var.f, vj0Var.d, vj0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                if (vj0Var.d != 0) {
                    m8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                    m8Var.m(vj0Var.d, "" + ((Object) vj0Var.e), z10);
                    break;
                } else {
                    m8Var.e(-1, org.telegram.ui.ActionBar.g6.p7);
                    m8Var.i("" + ((Object) vj0Var.e), z10);
                    break;
                }
            case 8:
                uj0 uj0Var = (uj0) view;
                uj0Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                CharSequence charSequence = vj0Var.e;
                b.q(uj0Var.M.animate().rotation(vj0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.jr.h, 340L);
                uj0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 1:
                k4Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.sa(context, 6, 0, false);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.s8(context, null);
                break;
            case 4:
                k4Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 5:
                k4Var = new org.telegram.ui.Cells.y9(context);
                break;
            case 6:
                c6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                k4Var = new org.telegram.ui.Cells.h5(21, 64, this.d, c6Var, true);
                break;
            case 7:
            default:
                k4Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 8:
                uj0 uj0Var = new uj0(context);
                ImageView imageView = new ImageView(context);
                uj0Var.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                uj0Var.addView(imageView, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                k4Var = uj0Var;
                break;
        }
        return new org.telegram.ui.Components.vk0(k4Var);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.E;
        int i10 = notificationsCustomSettingsActivity.s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = n1Var.b();
            View view = n1Var.a;
            vj0 vj0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (vj0) arrayList3.get(b10);
            if (vj0Var == null || vj0Var.c != 102) {
                int i11 = n1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.k4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.q8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.s8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.y9) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
