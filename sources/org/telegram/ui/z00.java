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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z00 extends bg.c {
    public final Context d;
    public final /* synthetic */ c10 e;

    public z00(c10 c10Var, Context context) {
        this.e = c10Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ql0
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
        t00 t00Var = (t00) this.e.M.get(i10);
        if (t00Var == null) {
            return 3;
        }
        return t00Var.a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        c10 c10Var = this.e;
        ArrayList arrayList = c10Var.M;
        t00 t00Var = (t00) arrayList.get(i10);
        if (t00Var == null) {
            return;
        }
        int i12 = i10 + 1;
        boolean z4 = false;
        boolean z10 = (i12 >= arrayList.size() || (i11 = ((t00) arrayList.get(i12)).a) == 3 || i11 == 6) ? false : true;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (t00Var.f) {
                l4Var.setText(c10.x0(0, t00Var.d, false));
                return;
            } else {
                l4Var.setText(t00Var.d);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            String str = t00Var.i;
            if (str != null) {
                uaVar.d(str, t00Var.d, null, z10);
                return;
            }
            long j10 = t00Var.h;
            if (j10 > 0) {
                TLRPC.User user = c10Var.getMessagesController().getUser(Long.valueOf(j10));
                if (user != null) {
                    uaVar.d(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z10);
                    return;
                }
                return;
            }
            TLRPC.Chat chat = c10Var.getMessagesController().getChat(Long.valueOf(-j10));
            if (chat != null) {
                uaVar.d(chat, null, ChatObject.isCommunity(chat) ? LocaleController.getString(R.string.Community) : chat.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count) : !ChatObject.isPublic(chat) ? (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate) : (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic), z10);
                return;
            }
            return;
        }
        if (i13 != 4) {
            switch (i13) {
                case 6:
                    ((org.telegram.ui.Cells.z8) view).setText(t00Var.d);
                    break;
                case 7:
                    ((v00) view).e(t00Var.m, z10);
                    break;
                case 8:
                    k00 k00Var = (k00) view;
                    if (k00Var.c != z10) {
                        k00Var.c = z10;
                        k00Var.setWillNotDraw(!z10);
                        break;
                    }
                    break;
                case 9:
                    q00 q00Var = (q00) view;
                    c10Var.F = q00Var;
                    q00Var.e(org.telegram.ui.Components.u5.cloneSpans(c10Var.w, -1, q00Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                    c10Var.F.d(c10Var.getUserConfig().isPremium() ? c10Var.B : -1, false);
                    c10Var.F.setText(LocaleController.getString(R.string.FolderTagColor));
                    break;
                case 10:
                    kp0 kp0Var = (kp0) view;
                    kp0Var.setCloseAsLock(!c10Var.getUserConfig().isPremium());
                    kp0Var.a(c10Var.getUserConfig().isPremium() ? c10Var.B : -1, false);
                    kp0Var.setOnColorClick(new org.telegram.ui.Components.vk(13, this, kp0Var));
                    break;
                case 11:
                    r00 r00Var = (r00) view;
                    c10Var.G = r00Var;
                    r00Var.setText(t00Var.d);
                    org.telegram.ui.Cells.s3 s3Var = r00Var.r;
                    s3Var.setText(t00Var.e);
                    s3Var.setOnClickListener(t00Var.c);
                    break;
            }
            return;
        }
        i00 i00Var = (i00) view;
        boolean z11 = t00Var.l;
        ImageView imageView = i00Var.a;
        TextView textView = i00Var.b;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.o6, false), PorterDuff.Mode.MULTIPLY));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z11 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.q6, false));
        int i14 = t00Var.k;
        CharSequence charSequence = t00Var.d;
        ImageView imageView2 = i00Var.a;
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
        Boolean bool = i00Var.e;
        if (bool == null || bool.booleanValue() != z4) {
            i00Var.e = Boolean.valueOf(z4);
            if (i00Var.c == i14) {
                textView.clearAnimation();
                textView.animate().translationX(z4 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f).setDuration(180L).setInterpolator(org.telegram.ui.Components.mr.h).start();
            } else {
                textView.setTranslationX(z4 ? AndroidUtilities.dp(i15 * (-7)) : 0.0f);
            }
        }
        i00Var.d = z10;
        i00Var.setWillNotDraw(!z10);
        i00Var.c = i14;
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
        c10 c10Var = this.e;
        switch (i10) {
            case 0:
                view = new org.telegram.ui.Cells.l4(context, 22);
                break;
            case 1:
                org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(context, 6, 0, false);
                uaVar.setSelfAsSavedMessages(true);
                view = uaVar;
                break;
            case 2:
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) c10Var.fragmentView;
                String string = LocaleController.getString(R.string.FilterNameHint);
                f6Var = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                w00 w00Var = new w00(this.d, qv0Var, string, false, 12, f6Var);
                c10Var.H = w00Var;
                w00Var.n = false;
                org.telegram.ui.Cells.c3 c3Var = w00Var.b;
                c3Var.getEditText().setEmojiColor(Integer.valueOf(c10Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
                c3Var.setEmojiViewCacheType(25);
                c3Var.setText(c10Var.w);
                i11 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                org.telegram.ui.Components.l5.s(i11, c10Var.x);
                org.telegram.ui.Components.ut editText = c3Var.getEditText();
                editText.addTextChangedListener(new org.telegram.ui.Cells.g3());
                editText.addTextChangedListener(new x00(this));
                editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                c3Var.getEditText().setImeOptions(268435462);
                view = w00Var;
                break;
            case 3:
                view = new org.telegram.ui.Cells.y6(context, (b) null);
                break;
            case 4:
                i00 i00Var = new i00(context);
                i00Var.d = true;
                i00Var.e = null;
                ImageView imageView = new ImageView(context);
                i00Var.a = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                i00Var.addView(imageView, k7.b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
                TextView textView = new TextView(context);
                i00Var.b = textView;
                textView.setTextSize(1, 16.0f);
                textView.setLines(1);
                textView.setSingleLine();
                boolean z4 = LocaleController.isRTL;
                textView.setPadding(z4 ? 24 : 0, 0, z4 ? 0 : 24, 0);
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                boolean z10 = LocaleController.isRTL;
                i00Var.addView(textView, k7.b6.d(-1, -2.0f, 23, z10 ? 0.0f : 72.0f, 0.0f, z10 ? 72.0f : 0.0f, 0.0f));
                view = i00Var;
                break;
            case 5:
                s00 s00Var = new s00(context);
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
                s00Var.a = jj0Var;
                jj0Var.f(R.raw.filter_new, 100, 100, null);
                jj0Var.setScaleType(ImageView.ScaleType.CENTER);
                jj0Var.d();
                s00Var.addView(jj0Var, k7.b6.d(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                jj0Var.setOnClickListener(new a(s00Var, 24));
                view = s00Var;
                break;
            case 6:
            default:
                view = new org.telegram.ui.Cells.z8(context);
                break;
            case 7:
                i12 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                view = new y00(this, this.d, c10Var, i12, c10Var.r.id);
                break;
            case 8:
                view = new k00(context);
                break;
            case 9:
                view = new q00(c10Var, context);
                break;
            case 10:
                Activity parentActivity = c10Var.getParentActivity();
                i13 = ((org.telegram.ui.ActionBar.p2) c10Var).currentAccount;
                f6Var2 = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                view = new kp0(2, i13, parentActivity, f6Var2);
                break;
            case 11:
                f6Var3 = ((org.telegram.ui.ActionBar.p2) c10Var).resourceProvider;
                view = new r00(context, f6Var3);
                break;
        }
        return new org.telegram.ui.Components.dl0(view);
    }

    @Override // f2.o0
    public final void y(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 != 2 && i10 == 9) {
            q00 q00Var = (q00) l1Var.a;
            c10 c10Var = this.e;
            q00Var.e(org.telegram.ui.Components.u5.cloneSpans(c10Var.w, -1, c10Var.F.s.getPaint().getFontMetricsInt(), 0.5f), true);
        }
    }

    @Override // f2.o0
    public final void z(f2.l1 l1Var) {
        if (l1Var.f == 2) {
            org.telegram.ui.Cells.e3 e3Var = (org.telegram.ui.Cells.e3) l1Var.a;
            e3Var.b.k(true);
            e3Var.b.d();
        }
    }
}
