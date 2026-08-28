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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ z60 d;

    public x60(z60 z60Var, Context context) {
        this.d = z60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.r0
    public final int j(int i9) {
        z60 z60Var = this.d;
        if ((i9 >= z60Var.A && i9 < z60Var.B) || i9 == z60Var.F) {
            return 0;
        }
        if (i9 == z60Var.y || i9 == z60Var.D) {
            return 4;
        }
        if (i9 == z60Var.x || i9 == z60Var.G) {
            return 1;
        }
        return i9 == z60Var.E ? 5 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        z60 z60Var = this.d;
        boolean z10 = z60Var.J;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            if (i9 == z60Var.F) {
                k8Var.b(false, false);
                k8Var.d(z60Var.r, false, false);
                k8Var.setDeleteAction(new q50(this, 3));
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) z60Var).currentAccount;
            ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(z60Var.b0());
            int i12 = i9 - z60Var.A;
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i12);
            k8Var.d(stickerSets.get(i12), i12 != stickerSets.size() - 1, false);
            k8Var.setDeleteAction(null);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = z60Var.r;
            k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : z60Var.a0(z60Var.v) != null ? z60Var.a0(z60Var.v).id : 0L), false);
            return;
        }
        if (i11 == 1) {
            if (i9 != z60Var.x) {
                if (i9 == z60Var.G) {
                    ((org.telegram.ui.Cells.b9) view).setText(LocaleController.getString(R.string.AddGroupEmojiPackHint));
                    return;
                }
                return;
            }
            String string = LocaleController.getString(z10 ? R.string.ChooseEmojiPackMy : R.string.ChooseStickerSetMy);
            int indexOf = string.indexOf("@stickers");
            if (indexOf == -1) {
                ((org.telegram.ui.Cells.b9) view).setText(string);
                return;
            }
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.g4(this, 3), indexOf, indexOf + 9, 18);
                ((org.telegram.ui.Cells.b9) view).setText(spannableStringBuilder);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                ((org.telegram.ui.Cells.b9) view).setText(string);
                return;
            }
        }
        if (i11 == 4) {
            if (i9 == z60Var.D) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.AddEmojiPackHeader));
                return;
            } else {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(z10 ? R.string.ChooseEmojiPackHeader : R.string.ChooseStickerSetHeader));
                return;
            }
        }
        if (i11 != 5) {
            return;
        }
        w60 w60Var = (w60) view;
        boolean z11 = z60Var.F > 0;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = z60Var.r;
        w60Var.b = z11;
        org.telegram.ui.Components.mt mtVar = w60Var.a;
        v60 v60Var = w60Var.f;
        mtVar.removeTextChangedListener(v60Var);
        if (tL_messages_stickerSet3 == null) {
            mtVar.setText("");
        } else {
            String str = tL_messages_stickerSet3.set.short_name;
            mtVar.setText(str);
            mtVar.setSelection(str.length());
        }
        mtVar.addTextChangedListener(v60Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i9 == 0) {
            FrameLayout k8Var = new org.telegram.ui.Cells.k8(context, 3);
            k8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = k8Var;
        } else if (i9 == 1) {
            FrameLayout b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            frameLayout = b9Var;
        } else if (i9 != 5) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = m4Var;
        } else {
            z60 z60Var = this.d;
            w60 w60Var = new w60(z60Var, context);
            z60Var.K = w60Var;
            frameLayout = w60Var;
        }
        frameLayout.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
