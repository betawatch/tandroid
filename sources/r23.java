// default package

import org.json.JSONException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class r23 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v23 b;
    public final /* synthetic */ JSONException c;

    public /* synthetic */ r23(v23 v23Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = v23Var;
        this.c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        JSONException jSONException = this.c;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(new s13(new i1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 == null) {
                    ur5.e("callback");
                    throw null;
                }
                String message = jSONException.getMessage();
                h23Var2.B((message == null || message.length() <= 0) ? new s13(new i1((byte) 4), "Unknown error") : new s13(new i1((byte) 4), message));
                return;
        }
    }
}
