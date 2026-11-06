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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final u d = new u();
    public static final w e = new w();

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

    public static k1 b(View view, k1 k1Var) {
        int i7 = Build.VERSION.SDK_INT;
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            WindowInsets a10 = i7 >= 30 ? f0.a(view, g10) : y.a(view, g10);
            if (!a10.equals(g10)) {
                return k1.h(view, a10);
            }
        }
        return k1Var;
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
        View a10 = h0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a10 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (h0Var.b == null) {
                    h0Var.b = new SparseArray();
                }
                h0Var.b.put(keyCode, new WeakReference(a10));
            }
        }
        return a10 != null;
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

    public static String[] e(m.t tVar) {
        return Build.VERSION.SDK_INT >= 31 ? g0.a(tVar) : (String[]) tVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(int i7, View view) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i10 >= 28) {
                tag = d0.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z9 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z9) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z9 ? 32 : 2048);
                obtain.setContentChangeTypes(i7);
                if (z9) {
                    List<CharSequence> text = obtain.getText();
                    if (i10 >= 28) {
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
            if (i7 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                        return;
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e10);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i7);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i10 >= 28) {
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

    public static k1 g(View view, k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        if (g10 != null) {
            WindowInsets b10 = y.b(view, g10);
            if (!b10.equals(g10)) {
                return k1.h(view, b10);
            }
        }
        return k1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g h(View view, g gVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return g0.b(view, gVar);
        }
        u0.j jVar = (u0.j) view.getTag(R.id.tag_on_receive_content_listener);
        n nVar = d;
        if (jVar == null) {
            if (view instanceof n) {
                nVar = (n) view;
            }
            return nVar.a(gVar);
        }
        g a10 = u0.j.a(view, gVar);
        if (a10 == null) {
            return null;
        }
        if (view instanceof n) {
            nVar = (n) view;
        }
        return nVar.a(a10);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            e0.b(view, context, iArr, attributeSet, typedArray, i7, 0);
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
        a0.i(view, mVar);
    }
}
