package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zw extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public Drawable d;
    public Drawable e;
    public final /* synthetic */ cx f;

    public zw(cx cxVar, Context context) {
        this.f = cxVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 1 || i3 == 3;
    }

    @Override // u4.h0
    public final int b() {
        return this.f.w;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        cx cxVar = this.f;
        if (i3 == cxVar.h) {
            return 1;
        }
        return i3 == cxVar.s ? 0 : 3;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        cx cxVar = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i3 == cxVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i11 = cxVar.x;
                if (i11 == 0) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131751213, null));
                } else if (i11 == 1) {
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131751212, null));
                }
                if (org.telegram.messenger.az.s.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131742881, null)));
                }
                y8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 3) {
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            Long l10 = (Long) cxVar.e.get(i3 - cxVar.n);
            long longValue = l10.longValue();
            if (org.telegram.messenger.m5.E(longValue)) {
                h4Var.e(cxVar.getMessagesController().a2(l10), null, null, i3 != cxVar.r - 1);
                return;
            } else {
                h4Var.e(cxVar.getMessagesController().M0(Long.valueOf(-longValue)), null, null, i3 != cxVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        l8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
        if (this.d == null) {
            Context context = this.c;
            this.d = context.getResources().getDrawable(R.drawable.poll_add_circle);
            this.e = context.getResources().getDrawable(R.drawable.poll_add_plus);
        }
        Drawable drawable = this.d;
        Drawable drawable2 = this.e;
        int i12 = org.telegram.ui.ActionBar.k6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(l8Var, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.r6.y(l8Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
        l8Var.p(org.telegram.messenger.bd.M0(2131745678, null), new org.telegram.ui.Components.xp(drawable, drawable2), cxVar.n != -1);
        l8Var.getImageView().setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i3 == 0) {
            FrameLayout y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
            frameLayout = y8Var;
        } else if (i3 == 1) {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
            frameLayout = l8Var;
        } else if (i3 != 2) {
            FrameLayout h4Var = new org.telegram.ui.Cells.h4(context, 0, 0, false);
            ImageView e10 = org.telegram.messenger.camera.q.e(context, R.drawable.list_reorder);
            e10.setScaleType(ImageView.ScaleType.CENTER);
            h4Var.setTag(R.id.object_tag, e10);
            int i10 = 5;
            h4Var.addView(e10, b8.mf.d(40, -1.0f, (org.telegram.messenger.bd.a0 ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            e10.setOnTouchListener(new gi.n1(i10, this, h4Var));
            org.telegram.ui.ActionBar.r6.t(e10, org.telegram.ui.ActionBar.k6.b9, null, PorterDuff.Mode.MULTIPLY);
            frameLayout = h4Var;
        } else {
            cx cxVar = this.f;
            bx bxVar = new bx(cxVar, context);
            cxVar.f = bxVar;
            frameLayout = bxVar;
        }
        return new org.telegram.ui.Components.bj0(frameLayout);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 == 3 || i3 == 1) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, d1Var.a, null);
        }
    }
}
