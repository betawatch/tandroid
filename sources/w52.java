// default package

import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w52 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p8c b;

    public /* synthetic */ w52(p8c p8cVar, byte b) {
        this.a = b;
        this.b = p8cVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                p8cVar.a(new qd8((String) obj));
                break;
            case 1:
                mqc mqcVar = (mqc) obj;
                if (mqcVar != null) {
                    p8cVar.a(mqcVar);
                    break;
                }
                break;
            case 2:
                String str = (String) obj;
                w25.m("disconnect session", str);
                p8cVar.a(str);
                break;
            case 3:
                int[] iArr = (int[]) obj;
                boolean z = false;
                if (iArr.length >= 1 && iArr[0] == 0) {
                    z = true;
                }
                p8cVar.a(Boolean.valueOf(z));
                break;
            case 4:
                p8cVar.a((TL_stars.StarGift) obj);
                break;
            default:
                p8cVar.a((Boolean) obj);
                break;
        }
    }
}
