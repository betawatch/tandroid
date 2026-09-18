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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ v70 d;

    public t70(v70 v70Var, Context context) {
        this.d = v70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        v70 v70Var = this.d;
        if ((i10 >= v70Var.E && i10 < v70Var.F) || i10 == v70Var.J) {
            return 0;
        }
        if (i10 == v70Var.y || i10 == v70Var.H) {
            return 4;
        }
        if (i10 == v70Var.x || i10 == v70Var.K) {
            return 1;
        }
        return i10 == v70Var.I ? 5 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        v70 v70Var = this.d;
        boolean z10 = v70Var.N;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i10 == v70Var.J) {
                m8Var.b(false, false);
                m8Var.d(v70Var.r, false, false);
                m8Var.setDeleteAction(new m60(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) v70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(v70Var.c0());
            int i13 = i10 - v70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            m8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            m8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = v70Var.r;
            m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : v70Var.b0(v70Var.v) != null ? v70Var.b0(v70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != v70Var.x) {
                if (i10 == v70Var.K) {
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.e9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.e9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == v70Var.H) {
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
        s70 s70Var = (s70) view;
        boolean z11 = v70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = v70Var.r;
        s70Var.b = z11;
        org.telegram.ui.Components.bu buVar = s70Var.a;
        r70 r70Var = s70Var.f;
        buVar.removeTextChangedListener(r70Var);
        if (tL_messages_stickerSet3 == null) {
            buVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            buVar.setText(str);
            buVar.setSelection(str.length());
        }
        buVar.addTextChangedListener(r70Var);
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
            v70 v70Var = this.d;
            s70 s70Var = new s70(v70Var, context);
            v70Var.O = s70Var;
            frameLayout = s70Var;
        }
        frameLayout.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(frameLayout);
    }
}
