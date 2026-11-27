// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u17 extends q74 {
    public final qma X;
    public final /* synthetic */ b27 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u17(b27 b27Var) {
        super(100, false);
        this.Y = b27Var;
        this.X = new qma();
    }

    @Override // q74
    public final qma B1(int i) {
        TLRPC.PhotoSize w;
        r17 r17Var = this.Y.f;
        qma qmaVar = this.X;
        int i2 = 0;
        qmaVar.c = false;
        if (i == 0) {
            qmaVar.a = this.m;
            qmaVar.b = r0.e.h;
            qmaVar.c = true;
            return qmaVar;
        }
        int i3 = i - 1;
        if (r17Var.I() == null && r17Var.V == null) {
            i = i3;
        }
        qmaVar.a = 0.0f;
        qmaVar.b = 0.0f;
        Object J = r17Var.J(i);
        if (J instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
            TLRPC.Document document = botInlineResult.document;
            if (document != null) {
                TLRPC.PhotoSize w2 = xb4.w(document.thumbs, 90, false, null, false);
                qmaVar.a = w2 != null ? w2.w : 100.0f;
                qmaVar.b = w2 != null ? w2.h : 100.0f;
                while (i2 < botInlineResult.document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute = botInlineResult.document.attributes.get(i2);
                    if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        qmaVar.a = documentAttribute.w;
                        qmaVar.b = documentAttribute.h;
                        return qmaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.content != null) {
                while (i2 < botInlineResult.content.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = botInlineResult.content.attributes.get(i2);
                    if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qmaVar.a = documentAttribute2.w;
                        qmaVar.b = documentAttribute2.h;
                        return qmaVar;
                    }
                    i2++;
                }
            } else if (botInlineResult.thumb != null) {
                while (i2 < botInlineResult.thumb.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute3 = botInlineResult.thumb.attributes.get(i2);
                    if ((documentAttribute3 instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute3 instanceof TLRPC.TL_documentAttributeVideo)) {
                        qmaVar.a = documentAttribute3.w;
                        qmaVar.b = documentAttribute3.h;
                        return qmaVar;
                    }
                    i2++;
                }
            } else {
                TLRPC.Photo photo = botInlineResult.photo;
                if (photo != null && (w = xb4.w(photo.sizes, hl.Y0(false), false, null, false)) != null) {
                    qmaVar.a = w.w;
                    qmaVar.b = w.h;
                }
            }
        }
        return qmaVar;
    }

    @Override // q79
    public final int z() {
        r17 r17Var = this.Y.f;
        return (r17Var.I() == null && r17Var.V == null) ? A() : A() - 1;
    }
}
