package r7;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.b0;
import g7.l7;
import java.util.ArrayList;
import java.util.LinkedList;
import x5.q;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j {
    public j4.c a;
    public Bundle b;
    public LinkedList c;
    public final d e;
    public final Context f;
    public android.support.v4.media.c g;
    public final android.support.v4.media.c d = new android.support.v4.media.c(this, 16);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f = context;
    }

    public static void a(d dVar) {
        u5.d dVar2 = u5.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, u5.e.a);
        String c10 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new b0(context, b11));
        }
    }

    public final void b(int i9) {
        while (!this.c.isEmpty() && ((h6.e) this.c.getLast()).a() >= i9) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle, h6.e eVar) {
        if (this.a != null) {
            eVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(eVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        this.g = this.d;
        ArrayList arrayList = this.h;
        Context context = this.f;
        if (this.a == null) {
            try {
                synchronized (e.class) {
                    e.a(context);
                }
                s7.g V0 = l7.a(context).V0(new h6.b(context));
                if (V0 == null) {
                    return;
                }
                this.g.M(new j4.c(this.e, V0));
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    this.a.z((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            } catch (u5.f unused) {
            }
        }
    }
}
