// default package

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class yad implements Continuation, z76, tq2, fme {
    public static final /* synthetic */ yad b = new yad(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ yad(byte b2) {
        this.a = b2;
    }

    @Override // z76
    public final void R(Object obj) {
        ((r05) obj).getClass();
    }

    @Override // fme
    public final byte[] a(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 2:
                synchronized (pif.class) {
                    pif.a(new ahf());
                }
                return new sae();
            default:
                return new lja((Context) am2Var.a(Context.class));
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
