// default package

import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v73 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v73(l9a l9aVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.a = (byte) 2;
        this.b = l9aVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        switch (this.a) {
            case 0:
                v73 v73Var = new v73(2, zw2Var, (byte) 0);
                v73Var.b = obj;
                return v73Var;
            case 1:
                v73 v73Var2 = new v73(2, zw2Var, (byte) 1);
                v73Var2.b = obj;
                return v73Var2;
            default:
                return new v73((l9a) this.b, zw2Var);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                return ((v73) create((i0b) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 1:
                ((v73) create((String) obj, (zw2) obj2)).invokeSuspend(g9cVar);
                return g9cVar;
            default:
                return ((v73) create((l9a) obj, (zw2) obj2)).invokeSuspend(g9cVar);
        }
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ixe.b(obj);
                return Boolean.valueOf(!(((i0b) this.b) instanceof sh4));
            case 1:
                ixe.b(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return g9c.a;
            default:
                ixe.b(obj);
                return (l9a) this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v73(int i, zw2 zw2Var, byte b) {
        super(i, zw2Var);
        this.a = b;
    }
}
