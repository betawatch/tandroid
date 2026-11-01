package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.vu0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b4 extends org.telegram.ui.Cells.j3 {
    public final /* synthetic */ vg.f E;
    public final /* synthetic */ int F;
    public final /* synthetic */ g4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(g4 g4Var, Context context, vu0 vu0Var, String str, int i10, p6 p6Var, vg.f fVar, int i11) {
        super(context, vu0Var, str, true, i10, p6Var);
        this.G = g4Var;
        this.E = fVar;
        this.F = i11;
    }

    @Override // org.telegram.ui.Cells.j3
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        g4 g4Var = this.G;
        kj kjVar = g4Var.e2;
        TLRPC.MessageAction messageAction = g4Var.d2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else {
            if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
                return;
            }
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        }
        CharSequence[] charSequenceArr = {g4Var.l2.getText()};
        tL_textWithEntities.entities = vi.b0(this.F).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        kjVar.K5();
        g4Var.c2.f0(kjVar, true);
        g4Var.m2.O(true);
        g4Var.g1(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        vg.f fVar = this.E;
        fVar.setBounds(L, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.j3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
