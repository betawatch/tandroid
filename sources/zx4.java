// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class zx4 implements Continuation, d4b {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ zx4(gl2 gl2Var, String str) {
        this.a = (byte) 1;
        this.b = str;
    }

    @Override // d4b
    public final Bitmap l(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !task.isSuccessful() ? Tasks.forException(gl2.v(task)) : Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public /* synthetic */ zx4(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
