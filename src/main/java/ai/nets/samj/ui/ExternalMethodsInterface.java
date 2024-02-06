package ai.nets.samj.ui;

import java.io.File;
import java.util.List;

import ai.nets.samj.gui.components.ComboBoxItem;
import net.imglib2.RandomAccessibleInterval;
import net.imglib2.type.NativeType;
import net.imglib2.type.numeric.RealType;

/**
 * @author Carlos Javier Garcia Lopez de Haro
 */
public interface ExternalMethodsInterface {

	/**
	 * 
	 * @param <T>
	 * @param file
	 * @return
	 */
	public < T extends RealType< T > & NativeType< T > > RandomAccessibleInterval<T> getImageMask(File file);
	
	/**
	 * 
	 * @return
	 */
	public List<ComboBoxItem> getListOfOpenImages();
	
	
	
	
	
}