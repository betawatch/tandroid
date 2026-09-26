package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class y00 extends og.b {
    public final Context d;
    public final /* synthetic */ b10 e;

    public y00(b10 b10Var, Context context) {
        this.e = b10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.P.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        s00 s00Var = (s00) this.e.P.get(i10);
        if (s00Var == null) {
            return 3;
        }
        return s00Var.a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        b10 b10Var = this.e;
        ArrayList arrayList = b10Var.P;
        s00 s00Var = (s00) arrayList.get(i10);
        if (s00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((s00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (s00Var.f) {
                m4Var.setText(b10.x0(0, s00Var.d, false));
                return;
            } else {
                m4Var.setText(s00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            String str = s00Var.i;
            if (str != null) {
                zaVar.d(str, s00Var.d, null, z11);
                return;
            }
            long j3 = s00Var.h;
            if (j3 > 0) {
                TLRPC.User user = b10Var.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    zaVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = b10Var.getMessagesController().getChat(Long.valueOf(-j3));
            if (chat != null) {
                zaVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.e9) view).setText(s00Var.d);
                    break;
                case 7:
                    ((u00) view).e(s00Var.m, z11);
                    break;
                case 8:
                    i00 i00Var = (i00) view;
                    if (i00Var.c != z11) {
                        i00Var.c = z11;
                        i00Var.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    p00 p00Var = (p00) view;
                    b10Var.I = p00Var;
                    p00Var.e(org.telegram.ui.Components.z5.cloneSpans(b10Var.w, -1, p00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    b10Var.I.d(b10Var.getUserConfig().isPremium() ? b10Var.E : -1, false);
                    b10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    qp0 qp0Var = (qp0) view;
                    qp0Var.setCloseAsLock(!b10Var.getUserConfig().isPremium());
                    qp0Var.a(b10Var.getUserConfig().isPremium() ? b10Var.E : -1, false);
                    qp0Var.setOnColorClick(new bt(3, this, qp0Var));
                    break;
                case 11:
                    q00 q00Var = (q00) view;
                    b10Var.J = q00Var;
                    q00Var.setText(s00Var.d);
                    org.telegram.ui.Cells.u3 u3Var = q00Var.r;
                    u3Var.setText(s00Var.e);
                    u3Var.setOnClickListener(s00Var.c);
                    break;
            }
            return;
        }
        g00 g00Var = (g00) view;
        boolean z12 = s00Var.l;
        ImageView imageView = g00Var.a;
        TextView textView = g00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, z12 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, z12 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.q6, false));
        int i14 = s00Var.k;
        CharSequence charSequence = s00Var.d;
        ImageView imageView2 = g00Var.a;
        int i15 = LocaleController.isRTL ? -1 : 1;
        if (i14 == 0) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageResource(i14);
        }
        if (LocaleController.isRTL) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i14 == 0 ? 24.0f : 72.0f);
        }
        textView.setText(charSequence);
        if (!z11 && i14 != 0) {
            z10 = true;
        }
        Boolean bool = g00Var.e;
        if (bool == null || bool.booleanValue() != z10) {
            g00Var.e = Boolean.valueOf(z10);
            if (g00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.rr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        g00Var.d = z11;
        g00Var.setWillNotDraw(!z11);
        g00Var.c = i14;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        Context context = this.d;
        b10 b10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.za zaVar = new org.telegram.ui.Cells.za(context, 6, 0, false);
                zaVar.setSelfAsSavedMessages(true);
                view = zaVar;
                break;
            case 2:
                org.telegram.ui.Components.aw0 aw0Var = (org.telegram.ui.Components.aw0) b10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.m2) b10Var).resourceProvider;
                v00 v00Var = new v00(this.d, aw0Var, string, false, 12, d6Var);
                b10Var.K = v00Var;
                v00Var.n = false;
                org.telegram.ui.Cells.e3 e3Var = v00Var.b;
                e3Var.getEditText().setEmojiColor(Integer.valueOf(b10Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                e3Var.setEmojiViewCacheType(25);
                e3Var.setText(b10Var.w);
                i11 = ((org.telegram.ui.ActionBar.m2) b10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, b10Var.x);
                org.telegram.ui.Components.cu editText = e3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.i3());
                editText.addTextChangedListener(new w00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                e3Var.getEditText().setImeOptions(268435462);
                view = v00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                g00 g00Var = new g00(context);
                g00Var.d = true;
                g00Var.e = null;
                ImageView imageView = new ImageView(context);
                g00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                g00Var.addView(imageView, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                g00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                g00Var.addView(textView, w7.y5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = g00Var;
                break;
            case 5:
                r00 r00Var = new r00(context);
                org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(context);
                r00Var.a = lj0Var;
                lj0Var.f(R.raw.filter_new, 100, 100, null);
                lj0Var.setScaleType(ImageView.ScaleType.CENTER);
                lj0Var.d();
                r00Var.addView(lj0Var, w7.y5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                lj0Var.setOnClickListener(new a(r00Var, 24));
                view = r00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.e9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.m2) b10Var).currentAccount;
                view = new x00(this, this.d, b10Var, i12, b10Var.r.id);
                break;
            case 8:
                view = new i00(context);
                break;
            case 9:
                view = new p00(b10Var, context);
                break;
            case 10:
                Activity parentActivity = b10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.m2) b10Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.m2) b10Var).resourceProvider;
                view = new qp0(2, i13, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.m2) b10Var).resourceProvider;
                view = new q00(context, d6Var3);
                break;
        }
        return new org.telegram.ui.Components.gl0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            p00 p00Var = (p00) c1Var.a;
            b10 b10Var = this.e;
            p00Var.e(org.telegram.ui.Components.z5.cloneSpans(b10Var.w, -1, b10Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) c1Var.a;
            g3Var.b.k(true);
            g3Var.b.d();
        }
    }
}
