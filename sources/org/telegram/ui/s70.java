package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ u70 d;

    public s70(u70 u70Var, Context context) {
        this.d = u70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        u70 u70Var = this.d;
        if ((i10 >= u70Var.E && i10 < u70Var.F) || i10 == u70Var.J) {
            return 0;
        }
        if (i10 == u70Var.y || i10 == u70Var.H) {
            return 4;
        }
        if (i10 == u70Var.x || i10 == u70Var.K) {
            return 1;
        }
        return i10 == u70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        u70 u70Var = this.d;
        boolean z10 = u70Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == u70Var.J) {
                m8Var.b(false, false);
                m8Var.d(u70Var.r, false, false);
                m8Var.setDeleteAction(new l60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.n2) u70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(u70Var.c0());
            int i13 = i10 - u70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            m8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u70Var.r;
            m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : u70Var.b0(u70Var.v) != null ? u70Var.b0(u70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != u70Var.x) {
                if (i10 == u70Var.K) {
                    ((org.telegram.ui.Cells.e9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == u70Var.H) {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i12 != 5) {
            return;
        }
        r70 r70Var = (r70) view;
        boolean z11 = u70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = u70Var.r;
        r70Var.b = z11;
        org.telegram.ui.Components.zt ztVar = r70Var.a;
        q70 q70Var = r70Var.f;
        ztVar.removeTextChangedListener(q70Var);
        if (tL_messages_stickerSet3 == null) {
            ztVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            ztVar.setText(str);
            ztVar.setSelection(str.length());
        }
        ztVar.addTextChangedListener(q70Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout m8Var = new org.telegram.ui.Cells.m8(context, 3);
            m8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = m8Var;
        } else if (i10 == 1) {
            FrameLayout e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            frameLayout = e9Var;
        } else if (i10 != 5) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            frameLayout = l4Var;
        } else {
            u70 u70Var = this.d;
            r70 r70Var = new r70(u70Var, context);
            u70Var.O = r70Var;
            frameLayout = r70Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
