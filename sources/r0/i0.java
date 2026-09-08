package r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class i0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final v d = new v();
    public static final x e = new x();

    public static l0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        l0 l0Var = (l0) a.get(view);
        if (l0Var != null) {
            return l0Var;
        }
        l0 l0Var2 = new l0(view);
        a.put(view, l0Var2);
        return l0Var2;
    }

    public static l1 b(View view, l1 l1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            WindowInsets a2 = i10 >= 30 ? f0.a(view, g10) : y.a(view, g10);
            if (!a2.equals(g10)) {
                return l1.h(view, a2);
            }
        }
        return l1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = h0.d;
        h0 h0Var = (h0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (h0Var == null) {
            h0Var = new h0();
            h0Var.a = null;
            h0Var.b = null;
            h0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, h0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = h0Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = h0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (h0Var.a == null) {
                            h0Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = h0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                h0Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    h0Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = h0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (h0Var.b == null) {
                    h0Var.b = new SparseArray();
                }
                h0Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e0.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static String[] e(m.s sVar) {
        return Build.VERSION.SDK_INT >= 31 ? g0.a(sVar) : (String[]) sVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static l1 f(View view) {
        return Build.VERSION.SDK_INT >= 23 ? b0.a(view) : a0.f(view);
    }

    public static void g(int i10, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                tag = d0.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i10);
                if (z10) {
                    List<CharSequence> text = obtain.getText();
                    if (i11 >= 28) {
                        charSequence = d0.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                        return;
                    } catch (AbstractMethodError e7) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e7);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i10);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i11 >= 28) {
                charSequence = d0.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static l1 h(View view, l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            WindowInsets b10 = y.b(view, g10);
            if (!b10.equals(g10)) {
                return l1.h(view, b10);
            }
        }
        return l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g i(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.b(view, gVar);
        }
        u0.j jVar = (u0.j) view.getTag(R.id.tag_on_receive_content_listener);
        o oVar = d;
        if (jVar == null) {
            if (view instanceof o) {
                oVar = (o) view;
            }
            return oVar.a(gVar);
        }
        g a2 = u0.j.a(view, gVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof o) {
            oVar = (o) view;
        }
        return oVar.a(a2);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.b);
    }

    public static void l(View view, CharSequence charSequence) {
        new w(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        x xVar = e;
        if (charSequence == null) {
            xVar.a.remove(view);
            view.removeOnAttachStateChangeListener(xVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(xVar);
        } else {
            xVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(xVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(xVar);
            }
        }
    }

    public static void m(View view, n nVar) {
        a0.j(view, nVar);
    }
}
