package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.messenger.ij;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w3 extends org.telegram.ui.Cells.h3 {
    public final /* synthetic */ fh.g E;
    public final /* synthetic */ int F;
    public final /* synthetic */ b4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b4 b4Var, Context context, st0 st0Var, String str, int i7, h6 h6Var, fh.g gVar, int i10) {
        super(context, st0Var, str, true, i7, h6Var);
        this.G = b4Var;
        this.E = gVar;
        this.F = i10;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        b4 b4Var = this.G;
        ij ijVar = b4Var.h2;
        TLRPC.MessageAction messageAction = b4Var.g2;
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
        CharSequence[] charSequenceArr = {b4Var.o2.getText()};
        tL_textWithEntities.entities = ui.b0(this.F).W(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        ijVar.L5();
        b4Var.f2.g0(ijVar, true);
        b4Var.p2.O(true);
        b4Var.g1(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        fh.g gVar = this.E;
        gVar.setBounds(L, 0, measuredWidth, measuredHeight);
        gVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.h3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        super.onMeasure(i7, i10);
    }
}
