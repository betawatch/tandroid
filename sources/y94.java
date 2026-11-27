// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class y94 implements Continuation, NativeLifecycleLock.NativePointerCallable, a8b {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ y94(am2 am2Var, String str) {
        this.a = (byte) 2;
        this.b = str;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        MediaStream lambda$createLocalMediaStream$1;
        lambda$createLocalMediaStream$1 = PeerConnectionFactory.lambda$createLocalMediaStream$1(this.b, j);
        return lambda$createLocalMediaStream$1;
    }

    @Override // a8b
    public final Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.b, options);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 1:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !task.isSuccessful() ? Tasks.forException(am2.z(task)) : Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public /* synthetic */ y94(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
