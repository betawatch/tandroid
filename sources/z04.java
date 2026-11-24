// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z04 extends w64 {
    public final via X;
    public final /* synthetic */ t14 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z04(t14 t14Var) {
        super(100, true);
        this.Y = t14Var;
        this.X = new via();
        this.O = new nq1(this, (byte) 5);
    }

    @Override // w64
    public final via B1(int i) {
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.Document document;
        t14 t14Var = this.Y;
        y04 y04Var = t14Var.k0;
        w39 adapter = t14Var.i0.getAdapter();
        y04 y04Var2 = t14Var.o0;
        TLRPC.Document document2 = null;
        r4 = null;
        ArrayList<TLRPC.DocumentAttribute> arrayList2 = null;
        if (adapter != y04Var2) {
            if (y04Var.y.isEmpty()) {
                arrayList = null;
                return D1(document2, arrayList);
            }
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) y04Var.y.get(i);
            document = botInlineResult.document;
            if (document != null) {
                arrayList2 = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList2 = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList2 = webDocument2.attributes;
                    }
                }
            }
            arrayList = arrayList2;
            document2 = document;
            return D1(document2, arrayList);
        }
        int i2 = y04Var2.I;
        if (i <= i2) {
            if (i == i2) {
                return null;
            }
            document2 = (TLRPC.Document) t14Var.j1.get(i);
            arrayList = document2.attributes;
            return D1(document2, arrayList);
        }
        TLRPC.BotInlineResult botInlineResult2 = (TLRPC.BotInlineResult) y04Var2.y.get((i - i2) - 1);
        document = botInlineResult2.document;
        if (document != null) {
            arrayList2 = document.attributes;
        } else {
            TLRPC.WebDocument webDocument3 = botInlineResult2.content;
            if (webDocument3 != null) {
                arrayList2 = webDocument3.attributes;
            } else {
                TLRPC.WebDocument webDocument4 = botInlineResult2.thumb;
                if (webDocument4 != null) {
                    arrayList2 = webDocument4.attributes;
                }
            }
        }
        arrayList = arrayList2;
        document2 = document;
        return D1(document2, arrayList);
    }

    public final via D1(TLRPC.Document document, List list) {
        TLRPC.PhotoSize w;
        int i;
        int i2;
        via viaVar = this.X;
        viaVar.b = 100.0f;
        viaVar.a = 100.0f;
        if (document != null && (w = ba4.w(document.thumbs, 90, false, null, false)) != null && (i = w.w) != 0 && (i2 = w.h) != 0) {
            viaVar.a = i;
            viaVar.b = i2;
        }
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) list.get(i3);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    viaVar.a = documentAttribute.w;
                    viaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return viaVar;
    }

    @Override // d49
    public final int z() {
        t14 t14Var = this.Y;
        w39 adapter = t14Var.i0.getAdapter();
        y04 y04Var = t14Var.k0;
        if (adapter == y04Var && y04Var.y.isEmpty()) {
            return 0;
        }
        return A() - 1;
    }
}
