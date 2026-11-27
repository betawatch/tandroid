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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class vo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip7 b;

    public /* synthetic */ vo7(ip7 ip7Var, byte b) {
        this.a = b;
        this.b = ip7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final byte b2 = 1;
        boolean z = false;
        boolean z2 = false;
        ip7 ip7Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ip7Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    r47 r47Var = (r47) arrayList.get(i);
                    long B0 = r47.B0(r47Var.k);
                    TLRPC.Message message = r47Var.k;
                    if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !wf3.B(B0) && (r47Var.k.peer_id.channel_id == 0 || r47Var.z4())) {
                        arrayList2.add(0, r47Var);
                    }
                }
                if (!arrayList2.isEmpty() && !hl.n2(false) && !xea.B) {
                    hl.c3(new xo7(ip7Var, arrayList2, z2 ? 1 : 0));
                    break;
                }
                break;
            case 1:
                int i2 = Calendar.getInstance().get(11);
                if (i2 < 11 || i2 > 22) {
                    ip7Var.R();
                    break;
                } else {
                    ip7.m0.b(ip7Var.e0, null);
                    ip7Var.Z(true);
                    break;
                }
                break;
            case 2:
                ip7Var.z();
                break;
            case 3:
                try {
                    if (Math.abs(SystemClock.elapsedRealtime() - ip7Var.X) > 100) {
                        ip7Var.X = SystemClock.elapsedRealtime();
                        if (ip7Var.Y == null) {
                            SoundPool soundPool = new SoundPool(3, 1, 0);
                            ip7Var.Y = soundPool;
                            final boolean z3 = z ? 1 : 0;
                            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: ep7
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool2, int i3, int i4) {
                                    switch (z3) {
                                        case 0:
                                            if (i4 == 0) {
                                                try {
                                                    soundPool2.play(i3, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e) {
                                                    cc4.g(e, true);
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
                                                    cc4.g(e2, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        int i3 = ip7Var.a0;
                        if (i3 == 0 && !ip7Var.c0) {
                            ip7Var.c0 = true;
                            i3 = ip7Var.Y.load(a.b, R.raw.sound_out, 1);
                            ip7Var.a0 = i3;
                        }
                        int i4 = i3;
                        if (i4 != 0) {
                            try {
                                ip7Var.Y.play(i4, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
                break;
            case 4:
                ip7Var.Z(false);
                break;
            case 5:
                ip7Var.getClass();
                if (Math.abs(SystemClock.elapsedRealtime()) > 500) {
                    try {
                        if (ip7Var.Y == null) {
                            SoundPool soundPool2 = new SoundPool(3, 1, 0);
                            ip7Var.Y = soundPool2;
                            soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: ep7
                                @Override // android.media.SoundPool.OnLoadCompleteListener
                                public final void onLoadComplete(SoundPool soundPool22, int i32, int i42) {
                                    switch (b2) {
                                        case 0:
                                            if (i42 == 0) {
                                                try {
                                                    soundPool22.play(i32, 1.0f, 1.0f, 1, 0, 1.0f);
                                                    break;
                                                } catch (Exception e3) {
                                                    cc4.g(e3, true);
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
                                                    cc4.g(e22, true);
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        int i5 = ip7Var.Z;
                        if (i5 == 0 && !ip7Var.b0) {
                            ip7Var.b0 = true;
                            i5 = ip7Var.Y.load(a.b, R.raw.sound_in, 1);
                            ip7Var.Z = i5;
                        }
                        int i6 = i5;
                        if (i6 != 0) {
                            try {
                                ip7Var.Y.play(i6, 1.0f, 1.0f, 1, 0, 1.0f);
                                break;
                            } catch (Exception e3) {
                                cc4.g(e3, true);
                                return;
                            }
                        }
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                        return;
                    }
                }
                break;
            case 6:
                zh6 zh6Var = ip7Var.c;
                ArrayList arrayList3 = ip7Var.a;
                int i7 = 0;
                boolean z4 = false;
                while (i7 < arrayList3.size()) {
                    r47 r47Var2 = (r47) arrayList3.get(i7);
                    if (r47Var2 != null && r47Var2.J) {
                        arrayList3.remove(i7);
                        i7--;
                        SparseArray sparseArray = (SparseArray) zh6Var.f(r47.B0(r47Var2.k));
                        if (sparseArray != null) {
                            sparseArray.remove(r47Var2.e1());
                            if (sparseArray.size() <= 0) {
                                zh6Var.l(r47.B0(r47Var2.k));
                            }
                        }
                        z4 = true;
                    }
                    i7++;
                    z4 = z4;
                }
                jf7 messagesStorage = ip7Var.getMessagesStorage();
                messagesStorage.a.c(new be7(messagesStorage, (byte) 14));
                if (z4) {
                    ip7Var.Z(false);
                    break;
                }
                break;
            case 7:
                ip7Var.A();
                break;
            case 8:
                ArrayList arrayList4 = ip7Var.E;
                boolean isEmpty = arrayList4.isEmpty();
                arrayList4.clear();
                ip7Var.F.b();
                jf7 messagesStorage2 = ip7Var.getMessagesStorage();
                messagesStorage2.a.c(new be7(messagesStorage2, (byte) 13));
                if (!isEmpty) {
                    ip7Var.Z(false);
                    break;
                }
                break;
            case 9:
                zh6 zh6Var2 = ip7Var.h;
                ip7.m0.b(ip7Var.e0, null);
                ip7Var.n.b();
                for (int i8 = 0; i8 < zh6Var2.m(); i8++) {
                    ip7.m0.b(((Integer) zh6Var2.n(i8)).intValue(), null);
                }
                zh6Var2.b();
                break;
            case 10:
                ip7Var.S(ip7Var.t());
                break;
            case 11:
                ArrayList arrayList5 = ip7Var.E;
                long currentTimeMillis = System.currentTimeMillis();
                int i9 = 0;
                boolean z5 = false;
                while (i9 < arrayList5.size()) {
                    hp7 hp7Var = (hp7) arrayList5.get(i9);
                    Iterator it = hp7Var.c.entrySet().iterator();
                    while (it.hasNext()) {
                        if (currentTimeMillis >= ((Long) ((Pair) ((Map.Entry) it.next()).getValue()).second).longValue()) {
                            it.remove();
                            z5 = true;
                        }
                    }
                    if (z5) {
                        if (hp7Var.c.isEmpty()) {
                            jf7 messagesStorage3 = ip7Var.getMessagesStorage();
                            messagesStorage3.a.c(new le7(messagesStorage3, hp7Var.a, (byte) 2));
                            arrayList5.remove(i9);
                            i9--;
                        } else {
                            jf7 messagesStorage4 = ip7Var.getMessagesStorage();
                            messagesStorage4.a.c(new t87(messagesStorage4, hp7Var, (byte) 24));
                        }
                    }
                    i9++;
                    z5 = z5;
                }
                if (z5) {
                    ip7Var.Z(false);
                }
                ip7Var.d0();
                break;
            case 12:
                PowerManager.WakeLock wakeLock = ip7Var.W;
                ArrayList arrayList6 = ip7Var.b;
                if (f11.a) {
                    cc4.b("delay reached");
                }
                if (!arrayList6.isEmpty()) {
                    ip7Var.Z(true);
                    arrayList6.clear();
                }
                try {
                    if (wakeLock.isHeld()) {
                        wakeLock.release();
                        break;
                    }
                } catch (Exception e5) {
                    cc4.g(e5, true);
                    return;
                }
                break;
            default:
                ip7Var.getNotificationCenter().a(ip7Var, jn7.Y1);
                break;
        }
    }
}
