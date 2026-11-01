package vh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.yy;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f1 extends yy {
    public final qu0 X;
    public final /* synthetic */ g1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var) {
        super(100, true);
        this.Y = g1Var;
        this.X = new qu0();
        this.O = new jg.h1(this, 16);
    }

    @Override // s4.n0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.yy
    public final qu0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize w9;
        int i11;
        int i12;
        qu0 qu0Var = this.X;
        qu0Var.c = false;
        Object F = this.Y.c.F(i10);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    arrayList = webDocument2 != null ? webDocument2.attributes : null;
                }
            }
        } else {
            if (!(F instanceof TLRPC.Document)) {
                qu0Var.c = true;
                return qu0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        qu0Var.b = 100.0f;
        qu0Var.a = 100.0f;
        qu0Var.c = false;
        if (document != null && (w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false)) != null && (i11 = w9.w) != 0 && (i12 = w9.h) != 0) {
            qu0Var.a = i11;
            qu0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.a = documentAttribute.w;
                    qu0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }
}
