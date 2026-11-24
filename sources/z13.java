// default package

import org.json.JSONException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z13 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d23 b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ z13(d23 d23Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        JSONException jSONException = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.L(new z03(new h1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 == null) {
                    rp5.e("callback");
                    throw null;
                }
                String message = jSONException.getMessage();
                o13Var2.L((message == null || message.length() <= 0) ? new z03(new h1((byte) 4), "Unknown error") : new z03(new h1((byte) 4), message));
                return;
        }
    }
}
