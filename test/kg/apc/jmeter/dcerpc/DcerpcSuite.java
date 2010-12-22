/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kg.apc.jmeter.dcerpc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author APC
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({RPCPacketTest.class, RPCCallExceptionTest.class, RPCMarshallingExceptionTest.class, RPCCallRequestTest.class, DCERPCSamplerTest.class, RPCBindRequestTest.class, DCERPCMarshallingTest.class, BinaryUtilsTest.class, DCERPCSamplerUtilsTest.class})
public class DcerpcSuite {

   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   @Before
   public void setUp() throws Exception
   {
   }

   @After
   public void tearDown() throws Exception
   {
   }

}