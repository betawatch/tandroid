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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wy extends org.telegram.ui.Components.ql0 {
    public final Context c;
    public final /* synthetic */ zy d;

    public wy(zy zyVar, Context context) {
        this.d = zyVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
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
        zy zyVar = this.d;
        if (i10 == zyVar.h) {
            return 1;
        }
        return i10 == zyVar.s ? 0 : 3;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f;
        View view = l1Var.a;
        zy zyVar = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i10 == zyVar.s) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i12 = zyVar.w;
                if (i12 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetChatsInfo));
                } else if (i12 == 1) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.EditWidgetContactsInfo));
                }
                if (SharedConfig.passcodeHash.length() > 0) {
                    spannableStringBuilder.append((CharSequence) "\n\n").append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.WidgetPasscode2)));
                }
                z8Var.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            Long l10 = (Long) zyVar.e.get(i10 - zyVar.n);
            long longValue = l10.longValue();
            if (DialogObject.isUserDialog(longValue)) {
                f4Var.e(zyVar.getMessagesController().getUser(l10), null, null, i10 != zyVar.r - 1);
                return;
            } else {
                f4Var.e(zyVar.getMessagesController().getChat(Long.valueOf(-longValue)), null, null, i10 != zyVar.r - 1);
                return;
            }
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
        n8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
        Context context = this.c;
        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
        n8Var.n(LocaleController.getString(R.string.SelectChats), new org.telegram.ui.Components.mq(drawable, drawable2), zyVar.n != -1);
        n8Var.getImageView().setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            frameLayout = z8Var;
        } else if (i10 == 1) {
            FrameLayout n8Var = new org.telegram.ui.Cells.n8(context);
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = n8Var;
        } else if (i10 != 2) {
            FrameLayout f4Var = new org.telegram.ui.Cells.f4(context, 0, 0, false);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.list_reorder);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            f4Var.setTag(R.id.object_tag, imageView);
            f4Var.addView(imageView, k7.b6.d(40, -1.0f, (LocaleController.isRTL ? 3 : 5) | 16, 10.0f, 0.0f, 10.0f, 0.0f));
            imageView.setOnTouchListener(new org.telegram.ui.ActionBar.i1(4, this, f4Var));
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.b9, false), PorterDuff.Mode.MULTIPLY));
            frameLayout = f4Var;
        } else {
            zy zyVar = this.d;
            yy yyVar = new yy(zyVar, context);
            zyVar.f = yyVar;
            frameLayout = yyVar;
        }
        return new org.telegram.ui.Components.dl0(frameLayout);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 3 || i10 == 1) {
            l1Var.a.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        }
    }
}
