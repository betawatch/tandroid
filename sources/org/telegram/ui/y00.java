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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y00 extends bg.c {
    public final Context d;
    public final /* synthetic */ b10 e;

    public y00(b10 b10Var, Context context) {
        this.e = b10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 3 || i10 == 0 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 11) ? false : true;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.M.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        s00 s00Var = (s00) this.e.M.get(i10);
        if (s00Var == null) {
            return 3;
        }
        return s00Var.a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        b10 b10Var = this.e;
        ArrayList arrayList = b10Var.M;
        s00 s00Var = (s00) arrayList.get(i10);
        if (s00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z4 = false;
        boolean z10 = (i12 >= arrayList.size() || (i11 = ((s00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = l1Var.f;
        View view = l1Var.a;
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
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            String str = s00Var.i;
            if (str != null) {
                vaVar.d(str, s00Var.d, null, z10);
                return;
            }
            long j10 = s00Var.h;
            if (j10 > 0) {
                TLRPC.User user = b10Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    vaVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = b10Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                vaVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z10);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.a9) view).setText(s00Var.d);
                    break;
                case 7:
                    ((u00) view).e(s00Var.m, z10);
                    break;
                case 8:
                    j00 j00Var = (j00) view;
                    if (j00Var.c != z10) {
                        j00Var.c = z10;
                        j00Var.setWillNotDraw(!z10);
                        break;
                    }
                    break;
                case 9:
                    p00 p00Var = (p00) view;
                    b10Var.F = p00Var;
                    p00Var.e(org.telegram.ui.Components.u5.cloneSpans(b10Var.w, -1, p00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    b10Var.F.d(b10Var.getUserConfig().isPremium() ? b10Var.B : -1, false);
                    b10Var.F.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    ep0 ep0Var = (ep0) view;
                    ep0Var.setCloseAsLock(!b10Var.getUserConfig().isPremium());
                    ep0Var.a(b10Var.getUserConfig().isPremium() ? b10Var.B : -1, false);
                    ep0Var.setOnColorClick(new org.telegram.ui.Components.vk(13, this, ep0Var));
                    break;
                case 11:
                    q00 q00Var = (q00) view;
                    b10Var.G = q00Var;
                    q00Var.setText(s00Var.d);
                    org.telegram.ui.Cells.t3 t3Var = q00Var.r;
                    t3Var.setText(s00Var.e);
                    t3Var.setOnClickListener(s00Var.c);
                    break;
            }
            return;
        }
        h00 h00Var = (h00) view;
        boolean z11 = s00Var.l;
        ImageView imageView = h00Var.a;
        TextView textView = h00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z11 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.q6, false));
        int i14 = s00Var.k;
        CharSequence charSequence = s00Var.d;
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
        if (!z10 && i14 != 0) {
            z4 = true;
        }
        Boolean bool = h00Var.e;
        if (bool == null || bool.booleanValue() != z4) {
            h00Var.e = Boolean.valueOf(z4);
            if (h00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z4 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.nr.h).start();
            } else {
                textView.setTranslationX(z4 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        h00Var.d = z10;
        h00Var.setWillNotDraw(!z10);
        h00Var.c = i14;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        Context context = this.d;
        b10 b10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.m4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.va vaVar = new org.telegram.ui.Cells.va(context, 6, 0, false);
                vaVar.setSelfAsSavedMessages(true);
                view = vaVar;
                break;
            case 2:
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) b10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                v00 v00Var = new v00(this.d, qv0Var, string, false, 12, f6Var);
                b10Var.H = v00Var;
                v00Var.n = false;
                org.telegram.ui.Cells.d3 d3Var = v00Var.b;
                d3Var.getEditText().setEmojiColor(Integer.valueOf(b10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                d3Var.setEmojiViewCacheType(25);
                d3Var.setText(b10Var.w);
                i11 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                org.telegram.ui.Components.l5.s(i11, b10Var.x);
                org.telegram.ui.Components.vt editText = d3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.h3());
                editText.addTextChangedListener(new w00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                d3Var.getEditText().setImeOptions(268435462);
                view = v00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.z6(context, (b) null);
                break;
            case 4:
                h00 h00Var = new h00(context);
                h00Var.d = true;
                h00Var.e = null;
                ImageView imageView = new ImageView(context);
                h00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                h00Var.addView(imageView, k7.b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                h00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z4 = LocaleController.isRTL;
                textView.setPadding(z4 ? 24 : 0, 0, z4 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z10 = LocaleController.isRTL;
                h00Var.addView(textView, k7.b6.d(-1, -2.0f, 23, z10 ? 0.0f : 72.0f, 0.0f, z10 ? 72.0f : 0.0f, 0.0f));
                view = h00Var;
                break;
            case 5:
                r00 r00Var = new r00(context);
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                r00Var.a = jj0Var;
                jj0Var.f(R.raw.filter_new, 100, 100, null);
                jj0Var.setScaleType(ImageView.ScaleType.CENTER);
                jj0Var.d();
                r00Var.addView(jj0Var, k7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                jj0Var.setOnClickListener(new a(r00Var, 24));
                view = r00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.a9(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                view = new x00(this, this.d, b10Var, i12, b10Var.r.id);
                break;
            case 8:
                view = new j00(context);
                break;
            case 9:
                view = new p00(b10Var, context);
                break;
            case 10:
                Activity parentActivity = b10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) b10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                view = new ep0(2, i13, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.p2) b10Var).resourceProvider;
                view = new q00(context, f6Var3);
                break;
        }
        return new org.telegram.ui.Components.el0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 != 2 && i10 == 9) {
            p00 p00Var = (p00) l1Var.a;
            b10 b10Var = this.e;
            p00Var.e(org.telegram.ui.Components.u5.cloneSpans(b10Var.w, -1, b10Var.F.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        if (l1Var.f == 2) {
            org.telegram.ui.Cells.f3 f3Var = (org.telegram.ui.Cells.f3) l1Var.a;
            f3Var.b.k(true);
            f3Var.b.d();
        }
    }
}
