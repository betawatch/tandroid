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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zy extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ cz d;

    public zy(cz czVar, Context context) {
        this.d = czVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f;
        return i10 == 1 || i10 == 3;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.i0
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        cz czVar = this.d;
        if (i10 == czVar.h) {
            return 1;
        }
        return i10 == czVar.s ? 0 : 3;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
        cz czVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == czVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = czVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                e9Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            Long l4 = (Long) czVar.e.get(i10 - czVar.n);
            long longValue = l4.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                g4Var.e(czVar.getMessagesController().getUser(l4), null, null, i10 != czVar.r - 1);
                return;
            } else {
                g4Var.e(czVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != czVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        r8Var.e(-1, org.telegram.ui.ActionBar.i6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.k7, false), mode));
        r8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.fr(drawable, drawable2), czVar.n != -1);
        r8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
            frameLayout = e9Var;
        } else if (i10 == 1) {
            FrameLayout r8Var = new org.telegram.ui.Cells.r8(context);
            r8Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
            frameLayout = r8Var;
        } else if (i10 != 2) {
            FrameLayout g4Var = new org.telegram.ui.Cells.g4(0, 0, context, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            g4Var.setTag(R.id.object_tag, imageView);
            g4Var.addView(imageView, w7.x5.a(-1.0f, 10.0f, 0.0f, 10.0f, 0.0f, 40, (LocaleController.isRTL ? 3 : 5) | 16));
            imageView.setOnTouchListener(new ci.p1(5, this, g4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = g4Var;
        } else {
            cz czVar = this.d;
            bz bzVar = new bz(czVar, context);
            czVar.f = bzVar;
            frameLayout = bzVar;
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        int i10 = d1Var.f;
        if (i10 == 3 || i10 == 1) {
            d1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        }
    }
}
