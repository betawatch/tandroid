package x8;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class k extends Service implements c {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private ComponentName zza;
    private p zzb;
    private IBinder zzc;
    private Intent zzd;
    private Looper zze;
    private boolean zzg;
    private final Object zzf = new Object();
    private y8.d zzh = new y8.d(new mg.n(this, 23));

    public Looper getLooper() {
        if (this.zze == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.zze = handlerThread.getLooper();
        }
        return this.zze;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (r1.equals(x8.k.BIND_LISTENER_INTENT_ACTION) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r1.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L28;
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IBinder onBind(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -1487371046:
                break;
            case -1140095138:
                break;
            case -786751258:
                break;
            case 915816236:
                break;
            case 1003809169:
                break;
            case 1460975593:
                break;
            default:
                if (Log.isLoggable("WearableLS", 3)) {
                    Log.d("WearableLS", "onBind: Provided bind intent (" + intent.toString() + ") is not allowed");
                    break;
                }
                break;
        }
        return null;
    }

    @Override // x8.c
    public void onChannelClosed(b bVar, int i10, int i11) {
    }

    @Override // x8.c
    public void onChannelOpened(b bVar) {
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.zza = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onCreate: ".concat(String.valueOf(this.zza)));
        }
        this.zzb = new p(this, getLooper());
        Intent intent = new Intent(BIND_LISTENER_INTENT_ACTION);
        this.zzd = intent;
        intent.setComponent(this.zza);
        this.zzc = new m(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            Log.d("WearableLS", "onDestroy: ".concat(String.valueOf(this.zza)));
        }
        synchronized (this.zzf) {
            this.zzg = true;
            p pVar = this.zzb;
            if (pVar == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=".concat(String.valueOf(this.zza)));
            }
            pVar.getLooper().quit();
            pVar.a("quit");
        }
        super.onDestroy();
    }

    @Override // x8.c
    public void onInputClosed(b bVar, int i10, int i11) {
    }

    public abstract void onMessageReceived(g gVar);

    @Override // x8.c
    public void onOutputClosed(b bVar, int i10, int i11) {
    }

    public Task<byte[]> onRequest(String str, String str2, byte[] bArr) {
        return null;
    }

    public void onChannelClosed(d dVar, int i10, int i11) {
    }

    public void onChannelOpened(d dVar) {
    }

    public void onInputClosed(d dVar, int i10, int i11) {
    }

    public void onOutputClosed(d dVar, int i10, int i11) {
    }

    public void onCapabilityChanged(a aVar) {
    }

    public void onConnectedNodes(List<h> list) {
    }

    public void onDataChanged(e eVar) {
    }

    public void onEntityUpdate(l lVar) {
    }

    public void onNotificationReceived(n nVar) {
    }

    public void onPeerConnected(h hVar) {
    }

    public void onPeerDisconnected(h hVar) {
    }
}
