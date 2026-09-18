package t0;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b2.l1;
import c3.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.ih1;
import u2.d0;
import u2.o1;
import xh.g4;
import yh.a4;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements pa.a, b2, qc0, d9.e, q3.g, Continuation, q9.d, GenericProvider, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override // q9.d
    public Object G(cf.c cVar) {
        Set w10 = cVar.w(xa.a.class);
        xa.c cVar2 = xa.c.c;
        if (cVar2 == null) {
            synchronized (xa.c.class) {
                try {
                    cVar2 = xa.c.c;
                    if (cVar2 == null) {
                        cVar2 = new xa.c(0);
                        xa.c.c = cVar2;
                    }
                } finally {
                }
            }
        }
        return new xa.b(w10, cVar2);
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                return ((o) obj).c().getClass().getSimpleName();
            case 9:
                return i0.v(q.w(((d0) obj).r().b, new a(10)));
            case 10:
                return Integer.valueOf(((l1) obj).c);
            case 17:
                return Long.valueOf(((z3.a) obj).b);
            case 18:
                return Long.valueOf(((z3.a) obj).c);
            case 19:
                return (w3.o) obj;
            default:
                o1 o1Var = (o1) obj;
                o1Var.getClass();
                Bundle bundle = new Bundle();
                String str = o1.e;
                a1 a1Var = o1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override // q3.g
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override // org.telegram.ui.Components.qc0
    public String e(int i10) {
        switch (this.a) {
            case 4:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i10) {
        switch (this.a) {
            case 3:
                break;
            case 6:
                c2Var.dismiss();
                break;
            case 7:
                c2Var.dismiss();
                break;
            case 25:
                c2Var.dismiss();
                break;
            case 26:
                c2Var.dismiss();
                break;
            default:
                a4.d2(new ih1(6, null));
                break;
        }
    }

    @Override // pa.a
    public void j(pa.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = g4.k0;
        return 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z10;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            String str = "Crashlytics report successfully enqueued to DataTransport: " + bVar.b;
            t9.b bVar2 = t9.b.a;
            bVar2.b(str);
            File file = bVar.c;
            z10 = true;
            if (file.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
    }

    private final void b(c2 c2Var, int i10) {
    }
}
