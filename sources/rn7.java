// default package

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rn7 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public rn7(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(qn7 qn7Var) {
        boolean z;
        ArrayDeque arrayDeque = qn7Var.d;
        ComponentName componentName = qn7Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (qn7Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            qn7Var.b = bindService;
            if (bindService) {
                qn7Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = qn7Var.b;
        }
        if (!z || qn7Var.c == null) {
            b(qn7Var);
            return;
        }
        while (true) {
            on7 on7Var = (on7) arrayDeque.peek();
            if (on7Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + on7Var);
                }
                on7Var.a(qn7Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(qn7Var);
    }

    public final void b(qn7 qn7Var) {
        ComponentName componentName = qn7Var.a;
        ArrayDeque arrayDeque = qn7Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = qn7Var.e;
        int i2 = i + 1;
        qn7Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + qn7Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        wk5 wk5Var = null;
        if (i == 0) {
            on7 on7Var = (on7) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (sn7.c) {
                if (string != null) {
                    if (!string.equals(sn7.d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        sn7.e = hashSet2;
                        sn7.d = string;
                    }
                }
                hashSet = sn7.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.c.put(componentName2, new qn7(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        qn7 qn7Var = (qn7) entry.getValue();
                        if (qn7Var.b) {
                            this.a.unbindService(this);
                            qn7Var.b = false;
                        }
                        qn7Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (qn7 qn7Var2 : this.c.values()) {
                qn7Var2.d.add(on7Var);
                a(qn7Var2);
            }
        } else if (i == 1) {
            pn7 pn7Var = (pn7) message.obj;
            ComponentName componentName3 = pn7Var.a;
            IBinder iBinder = pn7Var.b;
            qn7 qn7Var3 = (qn7) this.c.get(componentName3);
            if (qn7Var3 != null) {
                int i2 = vk5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(wk5.g);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof wk5)) {
                        uk5 uk5Var = new uk5();
                        uk5Var.a = iBinder;
                        wk5Var = uk5Var;
                    } else {
                        wk5Var = (wk5) queryLocalInterface;
                    }
                }
                qn7Var3.c = wk5Var;
                qn7Var3.e = 0;
                a(qn7Var3);
                return true;
            }
        } else if (i == 2) {
            qn7 qn7Var4 = (qn7) this.c.get((ComponentName) message.obj);
            if (qn7Var4 != null) {
                if (qn7Var4.b) {
                    this.a.unbindService(this);
                    qn7Var4.b = false;
                }
                qn7Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            qn7 qn7Var5 = (qn7) this.c.get((ComponentName) message.obj);
            if (qn7Var5 != null) {
                a(qn7Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new pn7(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
