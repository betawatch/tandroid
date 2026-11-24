// default package

import android.media.SoundPool;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class zn7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;

    public /* synthetic */ zn7(lo7 lo7Var, byte b) {
        this.a = b;
        this.b = lo7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        boolean z = false;
        boolean z2 = false;
        lo7 lo7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = lo7Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    k47 k47Var = (k47) arrayList.get(i);
                    long B0 = k47.B0(k47Var.k);
                    TLRPC.Message message = k47Var.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !pg3.B(B0) && (k47Var.k.peer_id.channel_id == 0 || k47Var.z4())) {
                        arrayList2.add(0, k47Var);
                    }
                }
                if (!arrayList2.isEmpty() && !gm.n2(false) && !gda.B) {
                    gm.c3(new bo7(lo7Var, arrayList2, z2 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                int i2 = Calendar.getInstance().get(11);
                if (i2 < 11 || i2 > 22) {
                    lo7Var.R();
                    break;
                } else {
                    lo7.m0.b(lo7Var.e0, null);
                    lo7Var.Z(true);
                    break;
                }
                break;
            case 2:
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - lo7Var.X) > 100) {
                        lo7Var.X = SystemClock.elapsedRealtime();
                        if (lo7Var.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            lo7Var.Y = soundPool;
                            final boolean z3 = z ? 1 : 0;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: go7
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool2, int i3, int i4) {
                                    switch (z3) {
                                        case 0:
                                            if (i4 == 0) {
                                                try {
                                                    soundPool2.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e) {
                                                    fc4.g(e, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i4 == 0) {
                                                try {
                                                    soundPool2.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e2) {
                                                    fc4.g(e2, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        int i3 = lo7Var.a0;
                        if (i3 == 0 && !lo7Var.c0) {
                            lo7Var.c0 = true;
                            i3 = lo7Var.Y.load(a.b, R.raw.sound_out, 1);
                            lo7Var.a0 = i3;
                        }
                        int i4 = i3;
                        if (i4 != 0) {
                            try {
                                lo7Var.Y.play(i4, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e) {
                                fc4.g(e, true);
                                return;
                            }
                        }
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
                break;
            case 3:
                lo7Var.Z(false);
                break;
            case 4:
                lo7Var.z();
                break;
            case 5:
                vh6 vh6Var = lo7Var.h;
                lo7.m0.b(lo7Var.e0, null);
                lo7Var.n.b();
                for (int i5 = 0; i5 < vh6Var.m(); i5++) {
                    lo7.m0.b(((Integer) vh6Var.n(i5)).intValue(), null);
                }
                vh6Var.b();
                break;
            case 6:
                lo7Var.S(lo7Var.t());
                break;
            case 7:
                vh6 vh6Var2 = lo7Var.c;
                ArrayList arrayList3 = lo7Var.a;
                int i6 = 0;
                boolean z4 = false;
                while (i6 < arrayList3.size()) {
                    k47 k47Var2 = (k47) arrayList3.get(i6);
                    if (k47Var2 != null && k47Var2.J) {
                        arrayList3.remove(i6);
                        i6--;
                        SparseArray sparseArray = (SparseArray) vh6Var2.f(k47.B0(k47Var2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(k47Var2.e1());
                            if (sparseArray.size() <= 0) {
                                vh6Var2.l(k47.B0(k47Var2.k));
                            }
                        }
                        z4 = true;
                    }
                    i6++;
                    z4 = z4;
                }
                cf7 messagesStorage = lo7Var.getMessagesStorage();
                messagesStorage.a.c(new xd7(messagesStorage, (byte) 19));
                if (z4) {
                    lo7Var.Z(false);
                    break;
                }
                break;
            case 8:
                lo7Var.getClass();
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (lo7Var.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            lo7Var.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: go7
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool22, int i32, int i42) {
                                    switch (b2) {
                                        case 0:
                                            if (i42 == 0) {
                                                try {
                                                    soundPool22.play(i32, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e3) {
                                                    fc4.g(e3, true);
                                                    return;
                                                }
                                            }
                                            break;
                                        default:
                                            if (i42 == 0) {
                                                try {
                                                    soundPool22.play(i32, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e22) {
                                                    fc4.g(e22, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        int i7 = lo7Var.Z;
                        if (i7 == 0 && !lo7Var.b0) {
                            lo7Var.b0 = true;
                            i7 = lo7Var.Y.load(a.b, R.raw.sound_in, 1);
                            lo7Var.Z = i7;
                        }
                        int i8 = i7;
                        if (i8 != 0) {
                            try {
                                lo7Var.Y.play(i8, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                                return;
                            }
                        }
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                        return;
                    }
                }
                break;
            case 9:
                lo7Var.A();
                break;
            case 10:
                ArrayList arrayList4 = lo7Var.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                lo7Var.F.b();
                cf7 messagesStorage2 = lo7Var.getMessagesStorage();
                messagesStorage2.a.c(new xd7(messagesStorage2, (byte) 14));
                if (!isEmpty) {
                    lo7Var.Z(false);
                    break;
                }
                break;
            case 11:
                ArrayList arrayList5 = lo7Var.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i9 = 0;
                boolean z5 = false;
                while (i9 < arrayList5.size()) {
                    ko7 ko7Var = (ko7) arrayList5.get(i9);
                    Iterator it = ko7Var.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z5 = true;
                        }
                    }
                    if (z5) {
                        if (ko7Var.c.isEmpty()) {
                            cf7 messagesStorage3 = lo7Var.getMessagesStorage();
                            messagesStorage3.a.c(new vc7(messagesStorage3, ko7Var.a, (byte) 4));
                            arrayList5.remove(i9);
                            i9--;
                        } else {
                            cf7 messagesStorage4 = lo7Var.getMessagesStorage();
                            messagesStorage4.a.c(new q87(messagesStorage4, ko7Var, (byte) 28));
                        }
                    }
                    i9++;
                    z5 = z5;
                }
                if (z5) {
                    lo7Var.Z(false);
                }
                lo7Var.d0();
                break;
            case 12:
                PowerManager.WakeLock wakeLock = lo7Var.W;
                ArrayList arrayList6 = lo7Var.b;
                if (e21.a) {
                    fc4.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    lo7Var.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        break;
                    }
                } catch (Exception e5) {
                    fc4.g(e5, true);
                    return;
                }
                break;
            default:
                lo7Var.getNotificationCenter().a(lo7Var, nm7.Y1);
                break;
        }
    }
}
