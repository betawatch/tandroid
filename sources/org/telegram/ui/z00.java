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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class z00 extends og.b {
    public final Context d;
    public final /* synthetic */ c10 e;

    public z00(c10 c10Var, Context context) {
        this.e = c10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ll0
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
        t00 t00Var = (t00) this.e.P.get(i10);
        if (t00Var == null) {
            return 3;
        }
        return t00Var.a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.P;
        t00 t00Var = (t00) arrayList.get(i10);
        if (t00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z10 = false;
        boolean z11 = (i12 >= arrayList.size() || (i11 = ((t00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (t00Var.f) {
                m4Var.setText(c10.x0(0, t00Var.d, false));
                return;
            } else {
                m4Var.setText(t00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            String str = t00Var.i;
            if (str != null) {
                bbVar.d(str, t00Var.d, null, z11);
                return;
            }
            long j3 = t00Var.h;
            if (j3 > 0) {
                TLRPC.User user = c10Var.getMessagesController().getUser(Long.valueOf(j3));
                if (user != null) {
                    bbVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z11);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = c10Var.getMessagesController().getChat(Long.valueOf(-j3));
            if (chat != null) {
                bbVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z11);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.f9) view).setText(t00Var.d);
                    break;
                case 7:
                    ((v00) view).e(t00Var.m, z11);
                    break;
                case 8:
                    j00 j00Var = (j00) view;
                    if (j00Var.c != z11) {
                        j00Var.c = z11;
                        j00Var.setWillNotDraw(!z11);
                        break;
                    }
                    break;
                case 9:
                    q00 q00Var = (q00) view;
                    c10Var.I = q00Var;
                    q00Var.e(org.telegram.ui.Components.z5.cloneSpans(c10Var.w, -1, q00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    c10Var.I.d(c10Var.getUserConfig().isPremium() ? c10Var.E : -1, false);
                    c10Var.I.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    rp0 rp0Var = (rp0) view;
                    rp0Var.setCloseAsLock(!c10Var.getUserConfig().isPremium());
                    rp0Var.a(c10Var.getUserConfig().isPremium() ? c10Var.E : -1, false);
                    rp0Var.setOnColorClick(new dt(3, this, rp0Var));
                    break;
                case 11:
                    r00 r00Var = (r00) view;
                    c10Var.J = r00Var;
                    r00Var.setText(t00Var.d);
                    org.telegram.ui.Cells.u3 u3Var = r00Var.r;
                    u3Var.setText(t00Var.e);
                    u3Var.setOnClickListener(t00Var.c);
                    break;
            }
            return;
        }
        h00 h00Var = (h00) view;
        boolean z12 = t00Var.l;
        ImageView imageView = h00Var.a;
        TextView textView = h00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, z12 ? org.telegram.ui.ActionBar.h6.q7 : org.telegram.ui.ActionBar.h6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, z12 ? org.telegram.ui.ActionBar.h6.p7 : org.telegram.ui.ActionBar.h6.q6, false));
        int i14 = t00Var.k;
        CharSequence charSequence = t00Var.d;
        ImageView imageView2 = h00Var.a;
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
        Boolean bool = h00Var.e;
        if (bool == null || bool.booleanValue() != z10) {
            h00Var.e = Boolean.valueOf(z10);
            if (h00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.rr.h).start();
            } else {
                textView.setTranslationX(z10 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        h00Var.d = z11;
        h00Var.setWillNotDraw(!z11);
        h00Var.c = i14;
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
        c10 c10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.bb bbVar = new org.telegram.ui.Cells.bb(context, 6, 0, false);
                bbVar.setSelfAsSavedMessages(true);
                view = bbVar;
                break;
            case 2:
                org.telegram.ui.Components.pv0 pv0Var = (org.telegram.ui.Components.pv0) c10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                d6Var = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                w00 w00Var = new w00(this.d, pv0Var, string, false, 12, d6Var);
                c10Var.K = w00Var;
                w00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = w00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(c10Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(c10Var.w);
                i11 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                org.telegram.ui.Components.q5.s(i11, c10Var.x);
                org.telegram.ui.Components.cu editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new x00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = w00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            case 4:
                h00 h00Var = new h00(context);
                h00Var.d = true;
                h00Var.e = null;
                ImageView imageView = new ImageView(context);
                h00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                h00Var.addView(imageView, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                h00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z10 = LocaleController.isRTL;
                textView.setPadding(z10 ? 24 : 0, 0, z10 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z11 = LocaleController.isRTL;
                h00Var.addView(textView, w7.x5.d(-1, -2.0f, 23, z11 ? 0.0f : 72.0f, 0.0f, z11 ? 72.0f : 0.0f, 0.0f));
                view = h00Var;
                break;
            case 5:
                s00 s00Var = new s00(context);
                org.telegram.ui.Components.bj0 bj0Var = new org.telegram.ui.Components.bj0(context);
                s00Var.a = bj0Var;
                bj0Var.f(R.raw.filter_new, 100, 100, null);
                bj0Var.setScaleType(ImageView.ScaleType.CENTER);
                bj0Var.d();
                s00Var.addView(bj0Var, w7.x5.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                bj0Var.setOnClickListener(new a(s00Var, 24));
                view = s00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.f9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                view = new y00(this, this.d, c10Var, i12, c10Var.r.id);
                break;
            case 8:
                view = new j00(context);
                break;
            case 9:
                view = new q00(c10Var, context);
                break;
            case 10:
                Activity parentActivity = c10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.n2) c10Var).currentAccount;
                d6Var2 = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                view = new rp0(2, i13, parentActivity, d6Var2);
                break;
            case 11:
                d6Var3 = ((org.telegram.ui.ActionBar.n2) c10Var).resourceProvider;
                view = new r00(context, d6Var3);
                break;
        }
        return new org.telegram.ui.Components.wk0(view);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 != 2 && i10 == 9) {
            q00 q00Var = (q00) c1Var.a;
            c10 c10Var = this.e;
            q00Var.e(org.telegram.ui.Components.z5.cloneSpans(c10Var.w, -1, c10Var.I.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // s4.h0
    public final void z(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) c1Var.a;
            f3Var.b.k(true);
            f3Var.b.d();
        }
    }
}
