// default package

import android.util.Log;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.OnSuccessListener;
import java.io.IOException;
import java.util.Calendar;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zg implements ee, hp7, ke3, ku4, OnSuccessListener {
    public final /* synthetic */ byte a;

    public /* synthetic */ zg(sk skVar) {
        this.a = (byte) 19;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher a(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void b() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // hp7
    public final String c(int i) {
        switch (this.a) {
            case 4:
                if (i != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i2 = calendar.get(1);
                    calendar.add(6, i);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i2) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 8:
                boolean z = jb6.c0;
                String format = String.format("%02d", Integer.valueOf((i % 12 != 0 || z) ? i % (z ? 24 : 12) : 12));
                if (i >= 24) {
                    break;
                }
                break;
            case 10:
                if (i != 0) {
                    if (i >= 1 && i < 16) {
                        break;
                    } else if (i != 16) {
                        if (i != 17) {
                            if (i != 18) {
                                if (i != 19) {
                                    if (i == 20) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 12:
                switch (i) {
                }
            case 14:
                switch (i) {
                }
        }
        return String.format("%02d", Integer.valueOf(i));
    }

    @Override // ke3
    public final void f(nv8 nv8Var) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
        }
        nv8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // ku4
    public final Object l(Object obj) {
        Integer num = (Integer) obj;
        switch (this.a) {
            case 22:
                return "%s";
            default:
                return "%" + (num.intValue() + 1) + "$s";
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        boolean z = e21.a;
        fc4.b("sms listener registered");
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                break;
            case 7:
                heVar.dismiss();
                break;
            default:
                heVar.dismiss();
                break;
        }
    }

    public /* synthetic */ zg(byte b) {
        this.a = b;
    }
}
