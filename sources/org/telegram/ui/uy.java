package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class uy extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ xy d;

    public uy(xy xyVar, Context context) {
        this.d = xyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        xy xyVar = this.d;
        if (i10 == xyVar.h) {
            return 1;
        }
        return i10 == xyVar.s ? 0 : 3;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        xy xyVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == xyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = xyVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                a9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Long l10 = (Long) xyVar.e.get(i10 - xyVar.n);
            long longValue = l10.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                g4Var.e(xyVar.getMessagesController().getUser(l10), null, null, i10 != xyVar.r - 1);
                return;
            } else {
                g4Var.e(xyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != xyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
        o8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
        o8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.nq(drawable, drawable2), xyVar.n != -1);
        o8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            frameLayout = a9Var;
        } else if (i10 == 1) {
            FrameLayout o8Var = new org.telegram.ui.Cells.o8(context);
            o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = o8Var;
        } else if (i10 != 2) {
            FrameLayout g4Var = new org.telegram.ui.Cells.g4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            g4Var.setTag(R.id.object_tag, imageView);
            g4Var.addView(imageView, k7.b6.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new org.telegram.ui.ActionBar.i1(4, this, g4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = g4Var;
        } else {
            xy xyVar = this.d;
            wy wyVar = new wy(xyVar, context);
            xyVar.f = wyVar;
            frameLayout = wyVar;
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 3 || i10 == 1) {
            l1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
    }
}
