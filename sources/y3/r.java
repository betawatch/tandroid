package y3;

import d5.f0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements v {
    public static final r b = new r(0);
    public final /* synthetic */ int a;

    public /* synthetic */ r(int i9) {
        this.a = i9;
    }

    @Override // y3.v
    public int b(Object obj) {
        n nVar = (n) obj;
        switch (this.a) {
            case 2:
                String str = nVar.a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (f0.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
