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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ a70 d;

    public y60(a70 a70Var, Context context) {
        this.d = a70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.g0
    public final int j(int i10) {
        a70 a70Var = this.d;
        if ((i10 >= a70Var.E && i10 < a70Var.F) || i10 == a70Var.J) {
            return 0;
        }
        if (i10 == a70Var.y || i10 == a70Var.H) {
            return 4;
        }
        if (i10 == a70Var.x || i10 == a70Var.K) {
            return 1;
        }
        return i10 == a70Var.I ? 5 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        a70 a70Var = this.d;
        boolean z10 = a70Var.N;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            if (i10 == a70Var.J) {
                l8Var.b(false, false);
                l8Var.d(a70Var.r, false, false);
                l8Var.setDeleteAction(new s50(this, 3));
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.n2) a70Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i11).getStickerSets(a70Var.c0());
            int i13 = i10 - a70Var.E;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i13);
            l8Var.d(stickerSets.get(i13), i13 != stickerSets.size() - 1, false);
            l8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = a70Var.r;
            l8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : a70Var.b0(a70Var.v) != null ? a70Var.b0(a70Var.v).id : 0L), false);
            return;
        }
        if (i12 == 1) {
            if (i10 != a70Var.x) {
                if (i10 == a70Var.K) {
                    ((org.telegram.ui.Cells.d9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.d9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.n4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.d9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                ((org.telegram.ui.Cells.d9) view).setText(string);
                return;
            }
        }
        if (i12 == 4) {
            if (i10 == a70Var.H) {
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
        x60 x60Var = (x60) view;
        boolean z11 = a70Var.J > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = a70Var.r;
        x60Var.b = z11;
        org.telegram.ui.Components.iu iuVar = x60Var.a;
        w60 w60Var = x60Var.f;
        iuVar.removeTextChangedListener(w60Var);
        if (tL_messages_stickerSet3 == null) {
            iuVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            iuVar.setText(str);
            iuVar.setSelection(str.length());
        }
        iuVar.addTextChangedListener(w60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout l8Var = new org.telegram.ui.Cells.l8(context, 3);
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = l8Var;
        } else if (i10 == 1) {
            FrameLayout d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            frameLayout = d9Var;
        } else if (i10 != 5) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = l4Var;
        } else {
            a70 a70Var = this.d;
            x60 x60Var = new x60(a70Var, context);
            a70Var.O = x60Var;
            frameLayout = x60Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
