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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final u d = new u();
    public static final w e = new w();

    public static k0 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        k0 k0Var = (k0) a.get(view);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0(view);
        a.put(view, k0Var2);
        return k0Var2;
    }

    public static j1 b(View view, j1 j1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            WindowInsets a2 = i10 >= 30 ? e0.a(view, g10) : x.a(view, g10);
            if (!a2.equals(g10)) {
                return j1.h(view, a2);
            }
        }
        return j1Var;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = g0.d;
        g0 g0Var = (g0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (g0Var == null) {
            g0Var = new g0();
            g0Var.a = null;
            g0Var.b = null;
            g0Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, g0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = g0Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = g0.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (g0Var.a == null) {
                            g0Var.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = g0.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                g0Var.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    g0Var.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = g0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (g0Var.b == null) {
                    g0Var.b = new SparseArray();
                }
                g0Var.b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return d0.a(view);
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
        return Build.VERSION.SDK_INT >= 31 ? f0.a(sVar) : (String[]) sVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(int i10, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i11 >= 28) {
                tag = c0.a(view);
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
                        charSequence = c0.a(view);
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
                charSequence = c0.a(view);
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

    public static j1 g(View view, j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        if (g10 != null) {
            WindowInsets b10 = x.b(view, g10);
            if (!b10.equals(g10)) {
                return j1.h(view, b10);
            }
        }
        return j1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g h(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return f0.b(view, gVar);
        }
        u0.k kVar = (u0.k) view.getTag(R.id.tag_on_receive_content_listener);
        n nVar = d;
        if (kVar == null) {
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(gVar);
        }
        g a2 = u0.k.a(view, gVar);
        if (a2 == null) {
            return null;
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(a2);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            d0.b(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void j(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new v(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        w wVar = e;
        if (charSequence == null) {
            wVar.a.remove(view);
            view.removeOnAttachStateChangeListener(wVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(wVar);
        } else {
            wVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(wVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(wVar);
            }
        }
    }

    public static void l(View view, m mVar) {
        z.i(view, mVar);
    }
}
