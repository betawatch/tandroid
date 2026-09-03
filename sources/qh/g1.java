package qh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.pz;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class g1 extends pz {
    public final jv0 X;
    public final /* synthetic */ h1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var) {
        super(100, true);
        this.Y = h1Var;
        this.X = new jv0();
        this.O = new lh.n5(this, 7);
    }

    @Override // f2.w0
    public final int A() {
        return B();
    }

    @Override // org.telegram.ui.Components.pz
    public final jv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        jv0 jv0Var = this.X;
        jv0Var.c = false;
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
                jv0Var.c = true;
                return jv0Var;
            }
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        }
        jv0Var.b = 100.0f;
        jv0Var.a = 100.0f;
        jv0Var.c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            jv0Var.a = i11;
            jv0Var.b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    jv0Var.a = documentAttribute.w;
                    jv0Var.b = documentAttribute.h;
                    break;
                }
            }
        }
        return jv0Var;
    }
}
