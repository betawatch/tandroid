package t7;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.y;
import i7.e8;
import java.util.ArrayList;
import java.util.LinkedList;
import l3.g0;
import z5.q;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j {
    public g0 a;
    public Bundle b;
    public LinkedList c;
    public final d e;
    public final Context f;
    public za.c g;
    public final za.c d = new za.c(this, 19);
    public final ArrayList h = new ArrayList();

    public j(d dVar, Context context) {
        this.e = dVar;
        this.f = context;
    }

    public static void a(d dVar) {
        w5.d dVar2 = w5.d.d;
        Context context = dVar.getContext();
        int d = dVar2.d(context, w5.e.a);
        String c3 = q.c(context, d);
        String b10 = q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(dVar.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        dVar.addView(linearLayout);
        TextView textView = new TextView(dVar.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c3);
        linearLayout.addView(textView);
        Intent b11 = dVar2.b(context, null, d);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new y(context, b11));
        }
    }

    public final void b(int i10) {
        while (!this.c.isEmpty() && ((j6.e) this.c.getLast()).a() >= i10) {
            this.c.removeLast();
        }
    }

    public final void c(Bundle bundle, j6.e eVar) {
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
                u7.g V0 = e8.a(context).V0(new j6.b(context));
                if (V0 == null) {
                    return;
                }
                this.g.B(new g0(this.e, V0));
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.a.t((f) obj);
                }
                arrayList.clear();
            } catch (RemoteException e10) {
                throw new a6.b(e10);
            } catch (w5.f unused) {
            }
        }
    }
}
