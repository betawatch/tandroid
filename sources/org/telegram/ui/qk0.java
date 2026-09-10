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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qk0 extends ng.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public qk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 0 || i10 == 4) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.I.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i10 >= notificationsCustomSettingsActivity.I.size()) {
            return 5;
        }
        return ((pk0) notificationsCustomSettingsActivity.I.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.e.I;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        pk0 pk0Var = (pk0) arrayList.get(i10);
        int i11 = i10 + 1;
        boolean z10 = i11 < arrayList.size() && ((pk0) arrayList.get(i11)).a != 4;
        int i12 = c1Var.f;
        View view = c1Var.a;
        switch (i12) {
            case 0:
                ((org.telegram.ui.Cells.m4) view).setText(pk0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.x8) view).f("" + ((Object) pk0Var.e), pk0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.bb) view).g(pk0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.z8) view).b(pk0Var.h, "" + ((Object) pk0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (pk0Var.e != null) {
                    f9Var.setFixedSize(0);
                    f9Var.setText(pk0Var.e);
                    break;
                } else {
                    f9Var.setFixedSize(12);
                    f9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ga) view).c(pk0Var.e, pk0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                j5Var.setDrawLine(true);
                j5Var.setChecked(pk0Var.i);
                j5Var.b(pk0Var.e, pk0Var.f, pk0Var.d, pk0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                if (pk0Var.d != 0) {
                    s8Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                    s8Var.m(pk0Var.d, "" + ((Object) pk0Var.e), z10);
                    break;
                } else {
                    s8Var.e(-1, org.telegram.ui.ActionBar.j6.p7);
                    s8Var.i("" + ((Object) pk0Var.e), z10);
                    break;
                }
            case 8:
                ok0 ok0Var = (ok0) view;
                ok0Var.e(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
                CharSequence charSequence = pk0Var.e;
                org.telegram.messenger.em.q(ok0Var.Q.animate().rotation(pk0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.wr.h, 340L);
                ok0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.bb(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.z8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 6:
                f6Var = ((org.telegram.ui.ActionBar.p2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, f6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                ok0 ok0Var = new ok0(context);
                ImageView imageView = new ImageView(context);
                ok0Var.Q = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                ok0Var.addView(imageView, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = ok0Var;
                break;
        }
        return new org.telegram.ui.Components.fl0(m4Var);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.I;
        int i10 = notificationsCustomSettingsActivity.s;
        if (i10 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.w) != null && arrayList2.isEmpty())) {
            if (i10 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i10);
            }
            int b10 = c1Var.b();
            View view = c1Var.a;
            pk0 pk0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (pk0) arrayList3.get(b10);
            if (pk0Var == null || pk0Var.c != 102) {
                int i11 = c1Var.f;
                if (i11 == 0) {
                    ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i11 == 1) {
                    ((org.telegram.ui.Cells.x8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i11 == 3) {
                    ((org.telegram.ui.Cells.z8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.ga) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
