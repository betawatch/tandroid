// default package

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.webrtc.EglThread;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class su3 implements EglThread.ReleaseMonitor, rs4, nu4, Vector.TLDeserializer, y2c, tq2, b86, c86, fd, Continuation, OnFailureListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ su3(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void f(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // c86
    public final void a(Object obj, lk4 lk4Var) {
        ((bg8) obj).c(new ag8(lk4Var));
    }

    @Override // y2c
    public final Object apply(Object obj) {
        u9a u9aVar = (u9a) obj;
        String O = v9a.b.O(u9aVar);
        O.getClass();
        u9aVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = O.getBytes(kk1.a);
        bytes.getClass();
        return bytes;
    }

    @Override // rs4
    public final v21 b(d31 d31Var) {
        return d31Var.k(false);
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        ri4 lambda$getComponents$0;
        switch (this.a) {
            case 10:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 11:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 12:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 13:
                i26 i26Var = ExecutorsRegistrar.a;
                return l8c.a;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(am2Var);
                return lambda$getComponents$0;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // nu4
    public final Object h(Object obj) {
        int i = o24.U2;
        return 0;
    }

    @Override // b86
    public final void invoke(Object obj) {
        bg8 bg8Var = (bg8) obj;
        switch (this.a) {
            case 15:
                bg8Var.F(new e64(2, new zp2("Player release timed out."), 1003));
                break;
            default:
                bg8Var.onRenderedFirstFrame();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // org.webrtc.EglThread.ReleaseMonitor
    public final boolean onRelease(EglThread eglThread) {
        boolean lambda$create$1;
        lambda$create$1 = EglThread.lambda$create$1(eglThread);
        return lambda$create$1;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i;
        switch (this.a) {
            case 19:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }

    public /* synthetic */ su3(Object obj, byte b) {
        this.a = b;
    }
}
