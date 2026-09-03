package r0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public l(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f10, float f11, boolean z4) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedFling(this.c, f10, f11, z4);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedFling", e6);
            }
        }
        return false;
    }

    public final boolean b(float f10, float f11) {
        ViewParent e;
        if (this.d && (e = e(0)) != null) {
            try {
                return e.onNestedPreFling(this.c, f10, f11);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreFling", e6);
            }
        }
        return false;
    }

    public final boolean c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent e;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.d || (e = e(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e instanceof m) {
            ((m) e).E(viewGroup, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                e.onNestedPreScroll(viewGroup, i10, i11, iArr3);
            } catch (AbstractMethodError e6) {
                Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedPreScroll", e6);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent e;
        int i15;
        int i16;
        int[] iArr3;
        if (this.d && (e = e(i14)) != null) {
            if (i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i15 = iArr[0];
                    i16 = iArr[1];
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                if (iArr2 == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    int[] iArr4 = this.e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e instanceof n) {
                    ((n) e).i(viewGroup, i10, i11, i12, i13, i14, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i12;
                    iArr3[1] = iArr3[1] + i13;
                    if (e instanceof m) {
                        ((m) e).c(viewGroup, i10, i11, i12, i13, i14);
                    } else if (i14 == 0) {
                        try {
                            e.onNestedScroll(viewGroup, i10, i11, i12, i13);
                        } catch (AbstractMethodError e6) {
                            Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onNestedScroll", e6);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i15;
                    iArr[1] = iArr[1] - i16;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i10) {
        if (i10 == 0) {
            return this.a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean f(int i10) {
        return e(i10) != null;
    }

    public final boolean g(int i10, int i11) {
        boolean onStartNestedScroll;
        if (!f(i11)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof m;
                    if (z4) {
                        onStartNestedScroll = ((m) parent).o(view2, view, i10, i11);
                    } else {
                        if (i11 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i10);
                            } catch (AbstractMethodError e) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i11 == 0) {
                            this.a = parent;
                        } else if (i11 == 1) {
                            this.b = parent;
                        }
                        if (z4) {
                            ((m) parent).s(view2, view, i10, i11);
                        } else if (i11 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i10);
                            } catch (AbstractMethodError e6) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e6);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i10) {
        ViewParent e = e(i10);
        if (e != null) {
            boolean z4 = e instanceof m;
            ViewGroup viewGroup = this.c;
            if (z4) {
                ((m) e).n(i10, viewGroup);
            } else if (i10 == 0) {
                try {
                    e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e6) {
                    Log.e("ViewParentCompat", "ViewParent " + e + " does not implement interface method onStopNestedScroll", e6);
                }
            }
            if (i10 == 0) {
                this.a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
