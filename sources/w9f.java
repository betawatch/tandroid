// default package

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class w9f implements Handler.Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w9f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        ccf ccfVar = (ccf) this.b;
        synchronized (ccfVar) {
            SparseArray sparseArray = ccfVar.e;
            uff uffVar = (uff) sparseArray.get(i);
            if (uffVar == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            ccfVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uffVar.c(new w30("Not supported by GmsCore", null));
                return true;
            }
            switch (uffVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        uffVar.b(null);
                        return true;
                    }
                    uffVar.c(new w30("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    uffVar.b(bundle);
                    return true;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                return a(message);
            default:
                int i = message.what;
                if (i == 0) {
                    aef aefVar = (aef) this.b;
                    synchronized (aefVar.a) {
                        o7f o7fVar = (o7f) message.obj;
                        y9f y9fVar = (y9f) aefVar.a.get(o7fVar);
                        if (y9fVar != null && y9fVar.a.isEmpty()) {
                            if (y9fVar.c) {
                                o7f o7fVar2 = y9fVar.e;
                                aef aefVar2 = y9fVar.h;
                                aefVar2.c.removeMessages(1, o7fVar2);
                                aefVar2.d.K(aefVar2.b, y9fVar);
                                y9fVar.c = false;
                                y9fVar.b = (byte) 2;
                            }
                            aefVar.a.remove(o7fVar);
                        }
                    }
                } else {
                    if (i != 1) {
                        return false;
                    }
                    aef aefVar3 = (aef) this.b;
                    synchronized (aefVar3.a) {
                        o7f o7fVar3 = (o7f) message.obj;
                        y9f y9fVar2 = (y9f) aefVar3.a.get(o7fVar3);
                        if (y9fVar2 != null && y9fVar2.b == 3) {
                            String valueOf = String.valueOf(o7fVar3);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = y9fVar2.f;
                            if (componentName == null) {
                                o7fVar3.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = o7fVar3.b;
                                xve.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            y9fVar2.onServiceDisconnected(componentName);
                        }
                    }
                }
                return true;
        }
    }
}
