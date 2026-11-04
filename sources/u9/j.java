package u9;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b8.ke;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import d2.o1;
import e3.o;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.ya0;
import t9.n;
import ug.c2;
import w2.a1;
import w2.e0;
import w2.r1;
import y3.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements t9.d, OnFailureListener, ta.a, p1, f9.k, g2.k, s3.g, ya0 {
    public final /* synthetic */ int a;

    public /* synthetic */ j(int i3) {
        this.a = i3;
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((a1) obj).b.release();
    }

    @Override // f9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                return ((o) obj).a().getClass().getSimpleName();
            case 13:
                return i0.q(g9.o.y(((e0) obj).p().b, new j(15)));
            case 15:
                return Integer.valueOf(((o1) obj).c);
            case 25:
                return Long.valueOf(((b4.a) obj).b);
            case 26:
                return Long.valueOf(((b4.a) obj).c);
            case 27:
                return (r) obj;
            default:
                r1 r1Var = (r1) obj;
                r1Var.getClass();
                Bundle bundle = new Bundle();
                String str = r1.e;
                s1 s1Var = r1Var.b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(s1Var.d);
                g0 listIterator = s1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((o1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
    }

    @Override // ta.a
    public void c(ta.b bVar) {
        switch (this.a) {
            case 8:
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "AnalyticsConnector now available.", null);
                }
                bVar.get().getClass();
                throw new ClassCastException();
            default:
                bVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // s3.g
    public boolean d(int i3, int i10, int i11, int i12, int i13) {
        if (i10 == 67 && i11 == 79 && i12 == 77 && (i13 == 77 || i3 == 2)) {
            return true;
        }
        if (i10 == 77 && i11 == 76 && i12 == 76) {
            return i13 == 84 || i3 == 2;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ya0
    public String e(int i3) {
        switch (this.a) {
            case 21:
                return String.valueOf(i3);
            default:
                return String.format("%02d", Integer.valueOf(i3 * 5));
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 10:
                s1Var.dismiss();
                break;
            case 11:
                s1Var.dismiss();
                break;
            case 20:
                break;
            case 23:
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 2:
                int i3 = c2.s0;
                break;
            default:
                Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
                break;
        }
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        ua.e lambda$getComponents$0;
        switch (this.a) {
            case 0:
                n nVar = ExecutorsRegistrar.a;
                return m.a;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(keVar);
                return lambda$getComponents$0;
        }
    }

    public /* synthetic */ j(androidx.emoji2.text.f fVar) {
        this.a = 8;
    }

    private final void b(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
    }
}
