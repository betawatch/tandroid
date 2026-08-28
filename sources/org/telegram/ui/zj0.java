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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zj0 extends wf.b {
    public final Context d;
    public final /* synthetic */ NotificationsCustomSettingsActivity e;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.e = notificationsCustomSettingsActivity;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 0 || i9 == 4) ? false : true;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.E.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 < 0) {
            return 5;
        }
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        if (i9 >= notificationsCustomSettingsActivity.E.size()) {
            return 5;
        }
        return ((yj0) notificationsCustomSettingsActivity.E.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList arrayList = this.e.E;
        if (i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        yj0 yj0Var = (yj0) arrayList.get(i9);
        int i10 = i9 + 1;
        boolean z10 = i10 < arrayList.size() && ((yj0) arrayList.get(i10)).a != 4;
        int i11 = q1Var.f;
        View view = q1Var.a;
        switch (i11) {
            case 0:
                ((org.telegram.ui.Cells.m4) view).setText(yj0Var.e);
                break;
            case 1:
                ((org.telegram.ui.Cells.t8) view).f("" + ((Object) yj0Var.e), yj0Var.i, z10);
                break;
            case 2:
                ((org.telegram.ui.Cells.va) view).g(yj0Var.g, null, z10);
                break;
            case 3:
                ((org.telegram.ui.Cells.v8) view).b(yj0Var.h, "" + ((Object) yj0Var.e), z10);
                break;
            case 4:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (yj0Var.e != null) {
                    b9Var.setFixedSize(0);
                    b9Var.setText(yj0Var.e);
                    break;
                } else {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    break;
                }
            case 5:
                ((org.telegram.ui.Cells.ba) view).c(yj0Var.e, yj0Var.f, false, z10);
                break;
            case 6:
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                j5Var.setDrawLine(true);
                j5Var.setChecked(yj0Var.i);
                j5Var.b(yj0Var.e, yj0Var.f, yj0Var.d, yj0Var.i, 0, false, z10, true);
                break;
            case 7:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                if (yj0Var.d != 0) {
                    p8Var.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                    p8Var.m(yj0Var.d, "" + ((Object) yj0Var.e), z10);
                    break;
                } else {
                    p8Var.e(-1, org.telegram.ui.ActionBar.f6.p7);
                    p8Var.i("" + ((Object) yj0Var.e), z10);
                    break;
                }
            case 8:
                xj0 xj0Var = (xj0) view;
                xj0Var.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                CharSequence charSequence = yj0Var.e;
                org.telegram.messenger.ll.r(xj0Var.M.animate().rotation(yj0Var.d == 1 ? 0.0f : 180.0f), org.telegram.ui.Components.gr.h, 340L);
                xj0Var.i(charSequence, z10);
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View m4Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        Context context = this.d;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.t8(context);
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.va(context, 6, 0, false);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.v8(context, null);
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ba(context);
                break;
            case 6:
                b6Var = ((org.telegram.ui.ActionBar.o2) notificationsCustomSettingsActivity).resourceProvider;
                m4Var = new org.telegram.ui.Cells.j5(21, 64, this.d, b6Var, true);
                break;
            case 7:
            default:
                m4Var = new org.telegram.ui.Cells.p8(context);
                break;
            case 8:
                xj0 xj0Var = new xj0(context);
                ImageView imageView = new ImageView(context);
                xj0Var.M = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(org.telegram.ui.ActionBar.f6.v6), PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.msg_expand);
                xj0Var.addView(imageView, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
                m4Var = xj0Var;
                break;
        }
        return new org.telegram.ui.Components.ik0(m4Var);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        boolean isGlobalNotificationsEnabled;
        ArrayList arrayList;
        ArrayList arrayList2;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.e;
        ArrayList arrayList3 = notificationsCustomSettingsActivity.E;
        int i9 = notificationsCustomSettingsActivity.s;
        if (i9 == 3 || ((arrayList2 = notificationsCustomSettingsActivity.w) != null && arrayList2.isEmpty())) {
            if (i9 == 3) {
                Boolean bool = notificationsCustomSettingsActivity.n;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = notificationsCustomSettingsActivity.w) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = notificationsCustomSettingsActivity.getNotificationsController().isGlobalNotificationsEnabled(i9);
            }
            int b10 = q1Var.b();
            View view = q1Var.a;
            yj0 yj0Var = (b10 < 0 || b10 >= arrayList3.size()) ? null : (yj0) arrayList3.get(b10);
            if (yj0Var == null || yj0Var.c != 102) {
                int i10 = q1Var.f;
                if (i10 == 0) {
                    ((org.telegram.ui.Cells.m4) view).a(null, isGlobalNotificationsEnabled);
                    return;
                }
                if (i10 == 1) {
                    ((org.telegram.ui.Cells.t8) view).e(null, isGlobalNotificationsEnabled);
                } else if (i10 == 3) {
                    ((org.telegram.ui.Cells.v8) view).a(null, isGlobalNotificationsEnabled);
                } else {
                    if (i10 != 5) {
                        return;
                    }
                    ((org.telegram.ui.Cells.ba) view).a(null, isGlobalNotificationsEnabled);
                }
            }
        }
    }
}
