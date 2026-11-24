// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pg4 extends tk4 {
    public final /* synthetic */ byte V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg4(byte b, Context context, Object obj) {
        super(context, null);
        this.V = b;
        this.W = obj;
    }

    @Override // tk4
    public final int getColumnsCount() {
        byte b = this.V;
        Object obj = this.W;
        switch (b) {
            case 0:
                return ((ch4) obj).s;
            default:
                return ((ah4) obj).d.s;
        }
    }
}
